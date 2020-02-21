// Generated from Pascal.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PascalParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PascalVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PascalParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PascalParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#programHeading}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramHeading(PascalParser.ProgramHeadingContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(PascalParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(PascalParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#variableDecBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDecBlock(PascalParser.VariableDecBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(PascalParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolInput}
	 * labeled alternative in {@link PascalParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolInput(PascalParser.BoolInputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numInput}
	 * labeled alternative in {@link PascalParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumInput(PascalParser.NumInputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringInput}
	 * labeled alternative in {@link PascalParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringInput(PascalParser.StringInputContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#idList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdList(PascalParser.IdListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(PascalParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#procAndFuncDecPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcAndFuncDecPart(PascalParser.ProcAndFuncDecPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#procOrFuncDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcOrFuncDec(PascalParser.ProcOrFuncDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureDeclaration(PascalParser.ProcedureDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(PascalParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#formalParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParam(PascalParser.FormalParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#parameterGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterGroup(PascalParser.ParameterGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(PascalParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PascalParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#simpleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleStatement(PascalParser.SimpleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#procedureStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureStatement(PascalParser.ProcedureStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code visitWriteExpr}
	 * labeled alternative in {@link PascalParser#write}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisitWriteExpr(PascalParser.VisitWriteExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code visitWriteId}
	 * labeled alternative in {@link PascalParser#write}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisitWriteId(PascalParser.VisitWriteIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code visitWriteStr}
	 * labeled alternative in {@link PascalParser#write}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisitWriteStr(PascalParser.VisitWriteStrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code visitWriteEmpty}
	 * labeled alternative in {@link PascalParser#write}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisitWriteEmpty(PascalParser.VisitWriteEmptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code visitReadId}
	 * labeled alternative in {@link PascalParser#read}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisitReadId(PascalParser.VisitReadIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code visitReadStr}
	 * labeled alternative in {@link PascalParser#read}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisitReadStr(PascalParser.VisitReadStrContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#structuredStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructuredStatement(PascalParser.StructuredStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#assignStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStatement(PascalParser.AssignStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#emptyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(PascalParser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#conditionalStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalStatement(PascalParser.ConditionalStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(PascalParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(PascalParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idExpression}
	 * labeled alternative in {@link PascalParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpression(PascalParser.IdExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link PascalParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpression(PascalParser.StringExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numExpression}
	 * labeled alternative in {@link PascalParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumExpression(PascalParser.NumExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link PascalParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpression(PascalParser.BoolExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link PascalParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(PascalParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multExpression}
	 * labeled alternative in {@link PascalParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExpression(PascalParser.MultExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link PascalParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(PascalParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationExpression}
	 * labeled alternative in {@link PascalParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationExpression(PascalParser.RelationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusExpression}
	 * labeled alternative in {@link PascalParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusExpression(PascalParser.PlusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionNumber}
	 * labeled alternative in {@link PascalParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionNumber(PascalParser.FunctionNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionExpression}
	 * labeled alternative in {@link PascalParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionExpression(PascalParser.FunctionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parentExpression}
	 * labeled alternative in {@link PascalParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentExpression(PascalParser.ParentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(PascalParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(PascalParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(PascalParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#actualParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActualParameter(PascalParser.ActualParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#parameterwidth}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterwidth(PascalParser.ParameterwidthContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(PascalParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#conditionBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionBlock(PascalParser.ConditionBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#caseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseStatement(PascalParser.CaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#whileDoStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileDoStatement(PascalParser.WhileDoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#forDoStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForDoStatement(PascalParser.ForDoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#caseNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseNumber(PascalParser.CaseNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#constList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstList(PascalParser.ConstListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numConstant}
	 * labeled alternative in {@link PascalParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumConstant(PascalParser.NumConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolConstant}
	 * labeled alternative in {@link PascalParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolConstant(PascalParser.BoolConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idConstant}
	 * labeled alternative in {@link PascalParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdConstant(PascalParser.IdConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code strConstant}
	 * labeled alternative in {@link PascalParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrConstant(PascalParser.StrConstantContext ctx);
}