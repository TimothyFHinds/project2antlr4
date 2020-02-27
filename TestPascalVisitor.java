/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
***/
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.misc.NotNull;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.*;
import java.lang.*;

public class TestPascalVisitor {
    
    public static class EvalVisitor extends PascalBaseVisitor<Value> {
    // used to compare floating point numbers
    public static final double SMALL_VALUE = 0.00000000001;

    // store variables (there's only one global scope!)
    // Symbol table
    private Map<String, Value> memory = new HashMap<String, Value>();

    public Boolean breakStatus = false;
    public Boolean continueStatus = false;

    @Override public Value visitVisitContinue(PascalParser.VisitContinueContext ctx) {
        //CONTINUE
        //return new Value(String.valueOf(ctx.getText()));
        continueStatus = true;
        return null;
    }
    @Override public Value visitVisitBreak(PascalParser.VisitBreakContext ctx) {
        //BREAK
        //throw error only viewable by the program
        //check inside visitWhile visitDo to see if a statement returns this error
        //if it does then we break our loop
        //we might want to consider changing our loops
        //return an interrupt
        breakStatus = true;
        return null;
    }

    @Override public Value visitWhileDoStatement(PascalParser.WhileDoStatementContext ctx) {
        //WHILE expression DO statement
        Value value = this.visit(ctx.expression());
        List<PascalParser.StatementContext> s1 = ctx.statement().structuredStatement().compoundStatement().statements().statement();
        PascalParser.StatementsContext statements_in_loop = ctx.statement().structuredStatement().compoundStatement().statements();

        //for(PascalParser.StatementsContext statementNUM : statements_in_loop) {
            //will visit each statement until a break or continue is found
            //Value evaluated = this.visit(statements_in_loop.statement());
        //}
        
        while(value.asBoolean() && !breakStatus) {
            for(PascalParser.StatementContext s2 : s1) {
                this.visit(s2);
                /*if(continueStatus)
                {
                    continueStatus = false;
                    continue;
                } */
            }
            
            //this.visit(ctx.statement());   
            
            //infinite loop
            //need to find how to break this loop at proper time
        }
        //reset breakStatus
        breakStatus = false;
        return Value.VOID;

    }   
    //for loops with DOWNTO
    @Override public Value visitVisitForDownto(PascalParser.VisitForDowntoContext ctx) {
        //FOR id LET initialVal TO finalVal DO statement
        String id = ctx.id().getText();
        Value initial = this.visit(ctx.initialVal);
        Value finalV = this.visit(ctx.finalVal);
        Double initialVal = initial.asDouble();
        Double finalVal = finalV.asDouble();
        //Value value = this.visit(ctx.expression());
        //String typeOfLoop = ctx.
        for(double i=initial.asDouble(); i>=finalV.asDouble();i--)
        {
            if(breakStatus)
            break;
            if(continueStatus)
            {
                continueStatus = false;
                continue;
            }    
            memory.replace(id, new Value(i));
            
            //execute statement
            this.visit(ctx.statement());
            //value = this.visit(ctx.expression());
        }
        //reset breakStatus
        breakStatus = false;
        return Value.VOID;
    }
    //for loops with TO
    @Override public Value visitVisitForTo(PascalParser.VisitForToContext ctx) {
        //FOR id LET initialVal TO finalVal DO statement
        String id = ctx.id().getText();
        Value initial = this.visit(ctx.initialVal);
        Value finalV = this.visit(ctx.finalVal);
        Double initialVal = initial.asDouble();
        Double finalVal = finalV.asDouble();
        //Value value = this.visit(ctx.expression());
        //String typeOfLoop = ctx.
        for(double i=initial.asDouble(); i<=finalV.asDouble();i++)
        {
            if(breakStatus)
            {
                break;
            }
            if(continueStatus)
            {
                continueStatus = false;
                continue;
            }    
            memory.replace(id, new Value(i));
            //execute statement
            this.visit(ctx.statement());
            //value = this.visit(ctx.expression());
        }
        breakStatus = false;
        return Value.VOID;
    }
    @Override public Value visitFunctionExpression(PascalParser.FunctionExpressionContext  ctx) {
        //function ( id )
        //first check if ctx.id() is in the symbol table
        String id = ctx.id().getText();
        if(!memory.containsKey(id))
        {
            throw new RuntimeException("invalid symbol:");
        }
            Double oldVal = memory.get(id).asDouble();
            Double newVal;
            switch(ctx.function.getType())
            {
                case PascalParser.SQRT:
                    newVal = Math.sqrt(oldVal);
                    memory.replace(id, new Value(newVal));
                    return new Value(newVal);
                case PascalParser.SIN:
                    newVal = Math.sin(oldVal);
                    memory.replace(id, new Value(newVal));
                    return new Value(newVal);
                case PascalParser.COS: 
                    newVal = Math.cos(oldVal);
                    memory.replace(id, new Value(newVal));
                    return new Value(newVal);
                case PascalParser.EXP:
                    newVal = Math.exp(oldVal);
                    memory.replace(id, new Value(newVal));
                    return new Value(newVal);
                case PascalParser.LN:
                    newVal = Math.log(oldVal);
                    memory.replace(id, new Value(newVal));
                    return new Value(newVal);
                default:
                    throw new RuntimeException("unknown operator: " + PascalParser.tokenNames[ctx.function.getType()]);
            }
        
    }

    @Override public Value visitFunctionNumber(PascalParser.FunctionNumberContext ctx) {
        
        Double oldVal = Double.valueOf(ctx.Uinput.getText());
        Double newVal;
        switch(ctx.function.getType())
            {
                case PascalParser.SQRT:
                    newVal = Math.sqrt(oldVal);
                    return new Value(newVal);
                case PascalParser.SIN:
                    newVal = Math.sin(oldVal);
                    return new Value(newVal);
                case PascalParser.COS: 
                    newVal = Math.cos(oldVal);
                    return new Value(newVal);
                case PascalParser.EXP:
                    newVal = Math.exp(oldVal);
                    return new Value(newVal);
                case PascalParser.LN:
                    newVal = Math.log(oldVal);
                    return new Value(newVal);
                default:
                    throw new RuntimeException("unknown operator: " + PascalParser.tokenNames[ctx.function.getType()]);
            }
        
    }

    @Override public Value visitVisitWriteId(PascalParser.VisitWriteIdContext ctx) {
        //check if id is in symbol table
        String id = ctx.id().getText();
        if(memory.containsKey(id))
        {
            //then we can get the symbol
            Value s1 = new Value(memory.get(id));
            System.out.println(s1.asString());
        }
        return null;

    }
   
    @Override public Value visitVisitWriteEmpty(PascalParser.VisitWriteEmptyContext ctx) {
        //in this scenario of writeln there is nothing inside the parentheses
        System.out.println();
        return null;
    }

    @Override public Value visitVisitWriteExpr(PascalParser.VisitWriteExprContext ctx) {
        //Value value = this.visit(ctx.expression());
        Value temp = visit(ctx.expression());
         System.out.println(temp.asString());
         return new Value(temp.asString());
    }
    @Override public Value visitVisitReadId(PascalParser.VisitReadIdContext ctx) {
        //System.out.println(memory.values());    //returns symbol table, for debugging
        //get userIO
        Scanner IOScanner = new Scanner(System.in);
        //System.out.print(">");
        String userIO = IOScanner.nextLine();
       
        //find the variable in symbol table to be updated by userIO
        String id = ctx.id().getText(); // the variable id being replaced
        if(memory.containsKey(id))
        {
            //then its in the symbol table
            //now check if userIO is a double or a boolean
            //FIRST WE SHOULD CHECK THE SYMBOL IN THE SYMBOL TABLE TO FIND OUT WHAT ITS TYPE IS!!!!
            Value oldVal = memory.get(id);
            if(oldVal.isDouble())
            {
                //now check if user input is correct
                Value userDouble = new Value(Double.valueOf(userIO));
                return new Value(memory.replace(id, userDouble));
            }
            if(oldVal.isBoolean())
            {
                Value userBoolean = new Value(Boolean.valueOf(userIO));
                return new Value(memory.replace(id, userBoolean));
            }


        }
        
         return null;
    }

    

    @Override public Value visitBoolInput(PascalParser.BoolInputContext ctx) {
        return new Value(Boolean.valueOf(ctx.getText()));
    }
    @Override public Value visitNumInput(PascalParser.NumInputContext ctx) {
        return new Value(Double.valueOf(ctx.getText()));
    }
    @Override public Value visitStringInput(PascalParser.StringInputContext ctx) {
        return new Value(String.valueOf(ctx.getText()));
    }
    @Override public Value visitVariableDeclaration(PascalParser.VariableDeclarationContext ctx) {
        //add a variable with an input to the symbol table
        int x = ctx.getChildCount();
        //if x=3 then there is an idList declaration of variables
        //if x=5 then there is a regular variable declaration happening
        if(x==5) {
        //prints the id for a single variable dec
        String id = ctx.id().getText();
        Value value = this.visit(ctx.input());
        //System.out.println(value.asDouble());
        return memory.put(id, value);
        } if(x==3)
        {
            //idList : type   cases
            //get the type as a string
            String type = ctx.type().getText();
            //check if type is REAL or BOOLEAN
            String realSTR = "REAL";
            String booleanSTR = "BOOLEAN";
            String strStr = "STRING";
            if(type.toUpperCase().equals(realSTR))
            {
                //we want to declare all of the variables inside idList as 0.0
                //get the list of ids from idList

                //loop through the idList
                int xd = ctx.idList().getChildCount();
                for(int i=0;i<xd;i=i+2)
                {
                    String newIDEN = ctx.idList().getChild(i).getText();
                    memory.put(newIDEN, new Value(0.0));
                }
            }
            else if(type.toUpperCase().equals(booleanSTR))
            {
                //we want to declare all of the variables inside idList as TRUE
                //loop through the idList just like in the above if statement
                int xd = ctx.idList().getChildCount();
                for(int i=0;i<xd;i=i+2)
                {
                    String newIDEN = ctx.idList().getChild(i).getText();
                    memory.put(newIDEN, new Value(true));
                }
            } else if(type.toUpperCase().equals(strStr))
            {
                int xd = ctx.idList().getChildCount();
                for(int i=0;i<xd;i=i+2)
                {
                    String newIDEN = ctx.idList().getChild(i).getText();
                    memory.put(newIDEN, new Value(""));
                }
            }

        }
        
         return null;
    }

    @Override public Value visitNotExpression(PascalParser.NotExpressionContext ctx) {
        Value value = this.visit(ctx.expression());
        return new Value(!value.asBoolean());
    }
    @Override public Value visitParentExpression(PascalParser.ParentExpressionContext ctx) {
        return this.visit(ctx.expression());
    }
    @Override public Value visitMultExpression(PascalParser.MultExpressionContext ctx) {
        Value left = this.visit(ctx.expression(0));
        Value right = this.visit(ctx.expression(1));

        switch(ctx.op.getType())
        {
            case PascalParser.MULT:
                return new Value(left.asDouble() * right.asDouble());
            case PascalParser.DIV:
                return new Value(left.asDouble() / right.asDouble());
            case PascalParser.AND:
                return new Value(left.asBoolean() == right.asBoolean());
        
        default:
                throw new RuntimeException("unknown operator: " + PascalParser.tokenNames[ctx.op.getType()]);
    }
}
    @Override public Value visitPlusExpression(PascalParser.PlusExpressionContext ctx) {
        Value left = this.visit(ctx.expression(0));
        Value right = this.visit(ctx.expression(1));

        switch(ctx.op.getType())
        {
            case PascalParser.OR:
                return new Value(left.asBoolean() || right.asBoolean());
            case PascalParser.PLUS:
                return left.isDouble() && right.isDouble() ? 
                    new Value(left.asDouble() + right.asDouble()):
                    new Value(left.asString() + right.asString());
            case PascalParser.MINUS:
                    return new Value(left.asDouble() - right.asDouble());
                default:
                    throw new RuntimeException("unknown operator: " + PascalParser.tokenNames[ctx.op.getType()]);
            }
    }

    @Override public Value visitRelationExpression(PascalParser.RelationExpressionContext ctx) {
        Value left = this.visit(ctx.expression(0));
        Value right = this.visit(ctx.expression(1));

        switch (ctx.op.getType()) {
            case PascalParser.EQUAL:
                if(left.isDouble() && right.isDouble())
                {
                    return left.isDouble() && right.isDouble() ?
                    new Value(Math.abs(left.asDouble() - right.asDouble()) < SMALL_VALUE) :
                    new Value(left.equals(right));
                } else if(left.isBoolean() && right.isBoolean()) {
                    return new Value(left.asBoolean() == right.asBoolean());
                } throw new RuntimeException("need booleans or double to check if EQUAL(=)");
            case PascalParser.NOT_EQUAL:
                if(left.isDouble() && right.isDouble())
                {
                    return left.isDouble() && right.isDouble() ?
                     new Value(Math.abs(left.asDouble() - right.asDouble()) >= SMALL_VALUE) :
                    new Value(!left.equals(right));
                } else if(left.isBoolean() && right.isBoolean()) {
                    return new Value(left.asBoolean() != right.asBoolean());
                } throw new RuntimeException("need booleans or double to check if NOT_EQUAL");
                
            case PascalParser.LT:
                return new Value(left.asDouble() < right.asDouble());
            case PascalParser.LE:
                return new Value(left.asDouble() <= right.asDouble());
            case PascalParser.GT:
                return new Value(left.asDouble() > right.asDouble());
            case PascalParser.GE:
                return new Value(left.asDouble() >= right.asDouble());
            default:
                throw new RuntimeException("unknown operator: " + PascalParser.tokenNames[ctx.op.getType()]);
        }
    }
    @Override public Value visitNumExpression(PascalParser.NumExpressionContext ctx) {
        return new Value(Double.valueOf(ctx.getText()));
    }
    @Override public Value visitNumConstant(PascalParser.NumConstantContext ctx) {
        return new Value(Double.valueOf(ctx.getText()));
    }
    @Override public Value visitBoolExpression(PascalParser.BoolExpressionContext ctx) {
        return new Value(Boolean.valueOf(ctx.getText()));
    }
    @Override public Value visitBoolConstant(PascalParser.BoolConstantContext ctx) {
        return new Value(Boolean.valueOf(ctx.getText()));
    }
    @Override public Value visitStrConstant(PascalParser.StrConstantContext ctx) {
        return new Value(String.valueOf(ctx.getText()));
    }
    @Override public Value visitIdExpression(PascalParser.IdExpressionContext ctx) {
        String id = ctx.getText();
        Value value = memory.get(id);
        if(value == null) {
            throw new RuntimeException("no such variable: " + id);
        }
        return value;
    }
    @Override public Value visitIdConstant(PascalParser.IdConstantContext ctx) {
        String id = ctx.getText();
        Value value = memory.get(id);
        if(value == null) {
            throw new RuntimeException("no such variable: " + id);
        }
        return value;
    }
    @Override public Value visitStringExpression(PascalParser.StringExpressionContext ctx) {
        String str = ctx.getText();
        return new Value(str);
    }

   @Override public Value visitAssignStatement(PascalParser.AssignStatementContext ctx) {
       //id = expression
       String id = ctx.id().getText();
       Value value = this.visit(ctx.expression());
       return new Value(memory.put(id,value));
   }

   @Override public Value visitIfStatement(PascalParser.IfStatementContext ctx) {
  //System.out.println(memory.values());    //returns symbol table, for debugging

    PascalParser.ConditionBlockContext conditions = ctx.conditionBlock();
    //conditions: expression THEN statement
    //conditions.expression() conditions.statement()

    //visitConditionBlock(PascalParser.ConditionBlockContext
    boolean evaluatedBlock = false;

    Value evaluated = this.visit(conditions.expression());
    if(evaluated.asBoolean())
    {
        evaluatedBlock = true;
        return this.visit(conditions.statement());
    }

    if(!evaluatedBlock && ctx.statement() != null) 
    {
        // evaluate the else-stat_block (if present == not null)
        return this.visit(ctx.statement());
    }


    return null;
   }
    
        @Override public Value visitCaseStatement(PascalParser.CaseStatementContext ctx) {
            String id = ctx.id().getText(); //GPA, num1, etc
            //retrieve Value from symbol table
            if(!memory.containsKey(id))
            {
                throw new RuntimeException("Use a variable inside your case(variable) expression"); 
            } 
            Value expected = new Value(memory.get(id));  //GPA=3.0
            //for each constList
            //if a constant within constList is equal to expression
            //then evaluate the statement related to the constList
            //ctx.getChild(3) is the first constList
            boolean evaluatedCase = false;
            List<PascalParser.CaseNumberContext> cases = ctx.caseNumber();
            for(PascalParser.CaseNumberContext caseNUM : cases) {
                PascalParser.ConstListContext cList = caseNUM.constList();
                int x = cList.getChildCount();
                //number of children inside a constList
                x = x + 1;
                x = x / 2;
                int newX = (int)x;
                for(int i=0;i<newX;i++)
                {
                    Value evaluated = this.visit(cList.constant(i));
                    //System.out.println(evaluated.asString());
                    //System.out.println(cList.constant());
                    if(evaluated.asString().equals(expected.asString()))
                    {
                        evaluatedCase = true;
                        return this.visit(caseNUM.statement());
                    }
                }
            }
            if(!evaluatedCase && ctx.statements() != null) 
            {
                // evaluate the else-stat_block (if present == not null)
                return this.visit(ctx.statements());
            }
            return null;
        }
        
        
        
        
        
   }

    
    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if ( args.length>0 ) inputFile = args[0];
        InputStream is = System.in;
        if ( inputFile!=null ) {
            is = new FileInputStream(inputFile);
        }
        //CharStreams.fromFileName("myinputfile")
        ANTLRInputStream input = new ANTLRInputStream(is);

        PascalLexer lexer = new PascalLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PascalParser parser = new PascalParser(tokens);
        
        ParseTree tree = parser.program();
        EvalVisitor visitor = new EvalVisitor();
        visitor.visit(tree);
        /*
        parser.setBuildParseTree(true);      // tell ANTLR to build a parse tree
        ParseTree tree = parser.s(); // parse
        // show tree in text form
        System.out.println(tree.toStringTree(parser));

        EvalVisitor evalVisitor = new EvalVisitor();
        //int result = evalVisitor.visit(tree);
        //System.out.println("visitor result = "+result);
        evalVisitor.visit(tree);
        */
    }
}
