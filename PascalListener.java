// Generated from Pascal.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PascalParser}.
 */
public interface PascalListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PascalParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PascalParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PascalParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#programHeading}.
	 * @param ctx the parse tree
	 */
	void enterProgramHeading(PascalParser.ProgramHeadingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#programHeading}.
	 * @param ctx the parse tree
	 */
	void exitProgramHeading(PascalParser.ProgramHeadingContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(PascalParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(PascalParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(PascalParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(PascalParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#variableDecBlock}.
	 * @param ctx the parse tree
	 */
	void enterVariableDecBlock(PascalParser.VariableDecBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#variableDecBlock}.
	 * @param ctx the parse tree
	 */
	void exitVariableDecBlock(PascalParser.VariableDecBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(PascalParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(PascalParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolInput}
	 * labeled alternative in {@link PascalParser#input}.
	 * @param ctx the parse tree
	 */
	void enterBoolInput(PascalParser.BoolInputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolInput}
	 * labeled alternative in {@link PascalParser#input}.
	 * @param ctx the parse tree
	 */
	void exitBoolInput(PascalParser.BoolInputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numInput}
	 * labeled alternative in {@link PascalParser#input}.
	 * @param ctx the parse tree
	 */
	void enterNumInput(PascalParser.NumInputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numInput}
	 * labeled alternative in {@link PascalParser#input}.
	 * @param ctx the parse tree
	 */
	void exitNumInput(PascalParser.NumInputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringInput}
	 * labeled alternative in {@link PascalParser#input}.
	 * @param ctx the parse tree
	 */
	void enterStringInput(PascalParser.StringInputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringInput}
	 * labeled alternative in {@link PascalParser#input}.
	 * @param ctx the parse tree
	 */
	void exitStringInput(PascalParser.StringInputContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#idList}.
	 * @param ctx the parse tree
	 */
	void enterIdList(PascalParser.IdListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#idList}.
	 * @param ctx the parse tree
	 */
	void exitIdList(PascalParser.IdListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(PascalParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(PascalParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#procAndFuncDecPart}.
	 * @param ctx the parse tree
	 */
	void enterProcAndFuncDecPart(PascalParser.ProcAndFuncDecPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#procAndFuncDecPart}.
	 * @param ctx the parse tree
	 */
	void exitProcAndFuncDecPart(PascalParser.ProcAndFuncDecPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#procOrFuncDec}.
	 * @param ctx the parse tree
	 */
	void enterProcOrFuncDec(PascalParser.ProcOrFuncDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#procOrFuncDec}.
	 * @param ctx the parse tree
	 */
	void exitProcOrFuncDec(PascalParser.ProcOrFuncDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProcedureDeclaration(PascalParser.ProcedureDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProcedureDeclaration(PascalParser.ProcedureDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(PascalParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(PascalParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#formalParam}.
	 * @param ctx the parse tree
	 */
	void enterFormalParam(PascalParser.FormalParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#formalParam}.
	 * @param ctx the parse tree
	 */
	void exitFormalParam(PascalParser.FormalParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#parameterGroup}.
	 * @param ctx the parse tree
	 */
	void enterParameterGroup(PascalParser.ParameterGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#parameterGroup}.
	 * @param ctx the parse tree
	 */
	void exitParameterGroup(PascalParser.ParameterGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(PascalParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(PascalParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PascalParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PascalParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStatement(PascalParser.SimpleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStatement(PascalParser.SimpleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#procedureStatement}.
	 * @param ctx the parse tree
	 */
	void enterProcedureStatement(PascalParser.ProcedureStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#procedureStatement}.
	 * @param ctx the parse tree
	 */
	void exitProcedureStatement(PascalParser.ProcedureStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code visitWriteExpr}
	 * labeled alternative in {@link PascalParser#write}.
	 * @param ctx the parse tree
	 */
	void enterVisitWriteExpr(PascalParser.VisitWriteExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code visitWriteExpr}
	 * labeled alternative in {@link PascalParser#write}.
	 * @param ctx the parse tree
	 */
	void exitVisitWriteExpr(PascalParser.VisitWriteExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code visitWriteId}
	 * labeled alternative in {@link PascalParser#write}.
	 * @param ctx the parse tree
	 */
	void enterVisitWriteId(PascalParser.VisitWriteIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code visitWriteId}
	 * labeled alternative in {@link PascalParser#write}.
	 * @param ctx the parse tree
	 */
	void exitVisitWriteId(PascalParser.VisitWriteIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code visitWriteStr}
	 * labeled alternative in {@link PascalParser#write}.
	 * @param ctx the parse tree
	 */
	void enterVisitWriteStr(PascalParser.VisitWriteStrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code visitWriteStr}
	 * labeled alternative in {@link PascalParser#write}.
	 * @param ctx the parse tree
	 */
	void exitVisitWriteStr(PascalParser.VisitWriteStrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code visitWriteEmpty}
	 * labeled alternative in {@link PascalParser#write}.
	 * @param ctx the parse tree
	 */
	void enterVisitWriteEmpty(PascalParser.VisitWriteEmptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code visitWriteEmpty}
	 * labeled alternative in {@link PascalParser#write}.
	 * @param ctx the parse tree
	 */
	void exitVisitWriteEmpty(PascalParser.VisitWriteEmptyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code visitReadId}
	 * labeled alternative in {@link PascalParser#read}.
	 * @param ctx the parse tree
	 */
	void enterVisitReadId(PascalParser.VisitReadIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code visitReadId}
	 * labeled alternative in {@link PascalParser#read}.
	 * @param ctx the parse tree
	 */
	void exitVisitReadId(PascalParser.VisitReadIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code visitReadStr}
	 * labeled alternative in {@link PascalParser#read}.
	 * @param ctx the parse tree
	 */
	void enterVisitReadStr(PascalParser.VisitReadStrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code visitReadStr}
	 * labeled alternative in {@link PascalParser#read}.
	 * @param ctx the parse tree
	 */
	void exitVisitReadStr(PascalParser.VisitReadStrContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#structuredStatement}.
	 * @param ctx the parse tree
	 */
	void enterStructuredStatement(PascalParser.StructuredStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#structuredStatement}.
	 * @param ctx the parse tree
	 */
	void exitStructuredStatement(PascalParser.StructuredStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatement(PascalParser.AssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatement(PascalParser.AssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(PascalParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(PascalParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void enterConditionalStatement(PascalParser.ConditionalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void exitConditionalStatement(PascalParser.ConditionalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(PascalParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(PascalParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(PascalParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(PascalParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idExpression}
	 * labeled alternative in {@link PascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdExpression(PascalParser.IdExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idExpression}
	 * labeled alternative in {@link PascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdExpression(PascalParser.IdExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link PascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringExpression(PascalParser.StringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link PascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringExpression(PascalParser.StringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numExpression}
	 * labeled alternative in {@link PascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumExpression(PascalParser.NumExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numExpression}
	 * labeled alternative in {@link PascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumExpression(PascalParser.NumExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link PascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpression(PascalParser.BoolExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link PascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpression(PascalParser.BoolExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link PascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(PascalParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link PascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(PascalParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multExpression}
	 * labeled alternative in {@link PascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultExpression(PascalParser.MultExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multExpression}
	 * labeled alternative in {@link PascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultExpression(PascalParser.MultExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link PascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(PascalParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link PascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(PascalParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationExpression}
	 * labeled alternative in {@link PascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRelationExpression(PascalParser.RelationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationExpression}
	 * labeled alternative in {@link PascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRelationExpression(PascalParser.RelationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusExpression}
	 * labeled alternative in {@link PascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPlusExpression(PascalParser.PlusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusExpression}
	 * labeled alternative in {@link PascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPlusExpression(PascalParser.PlusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionNumber}
	 * labeled alternative in {@link PascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionNumber(PascalParser.FunctionNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionNumber}
	 * labeled alternative in {@link PascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionNumber(PascalParser.FunctionNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionExpression}
	 * labeled alternative in {@link PascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExpression(PascalParser.FunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionExpression}
	 * labeled alternative in {@link PascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExpression(PascalParser.FunctionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parentExpression}
	 * labeled alternative in {@link PascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParentExpression(PascalParser.ParentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parentExpression}
	 * labeled alternative in {@link PascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParentExpression(PascalParser.ParentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(PascalParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(PascalParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(PascalParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(PascalParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(PascalParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(PascalParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#actualParameter}.
	 * @param ctx the parse tree
	 */
	void enterActualParameter(PascalParser.ActualParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#actualParameter}.
	 * @param ctx the parse tree
	 */
	void exitActualParameter(PascalParser.ActualParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#parameterwidth}.
	 * @param ctx the parse tree
	 */
	void enterParameterwidth(PascalParser.ParameterwidthContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#parameterwidth}.
	 * @param ctx the parse tree
	 */
	void exitParameterwidth(PascalParser.ParameterwidthContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(PascalParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(PascalParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#conditionBlock}.
	 * @param ctx the parse tree
	 */
	void enterConditionBlock(PascalParser.ConditionBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#conditionBlock}.
	 * @param ctx the parse tree
	 */
	void exitConditionBlock(PascalParser.ConditionBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void enterCaseStatement(PascalParser.CaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void exitCaseStatement(PascalParser.CaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#whileDoStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileDoStatement(PascalParser.WhileDoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#whileDoStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileDoStatement(PascalParser.WhileDoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#forDoStatement}.
	 * @param ctx the parse tree
	 */
	void enterForDoStatement(PascalParser.ForDoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#forDoStatement}.
	 * @param ctx the parse tree
	 */
	void exitForDoStatement(PascalParser.ForDoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#caseNumber}.
	 * @param ctx the parse tree
	 */
	void enterCaseNumber(PascalParser.CaseNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#caseNumber}.
	 * @param ctx the parse tree
	 */
	void exitCaseNumber(PascalParser.CaseNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#constList}.
	 * @param ctx the parse tree
	 */
	void enterConstList(PascalParser.ConstListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#constList}.
	 * @param ctx the parse tree
	 */
	void exitConstList(PascalParser.ConstListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numConstant}
	 * labeled alternative in {@link PascalParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterNumConstant(PascalParser.NumConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numConstant}
	 * labeled alternative in {@link PascalParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitNumConstant(PascalParser.NumConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolConstant}
	 * labeled alternative in {@link PascalParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterBoolConstant(PascalParser.BoolConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolConstant}
	 * labeled alternative in {@link PascalParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitBoolConstant(PascalParser.BoolConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idConstant}
	 * labeled alternative in {@link PascalParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterIdConstant(PascalParser.IdConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idConstant}
	 * labeled alternative in {@link PascalParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitIdConstant(PascalParser.IdConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code strConstant}
	 * labeled alternative in {@link PascalParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterStrConstant(PascalParser.StrConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code strConstant}
	 * labeled alternative in {@link PascalParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitStrConstant(PascalParser.StrConstantContext ctx);
}