package InterpreterPatternHomeWork;

public abstract class NonTerminalExpression implements Expression {
	
	protected final Expression leftExpression;
	protected final Expression rightExpression;

	public NonTerminalExpression(Expression exp1, Expression exp2) {
		leftExpression=exp1;
		rightExpression=exp2;
	}
}
