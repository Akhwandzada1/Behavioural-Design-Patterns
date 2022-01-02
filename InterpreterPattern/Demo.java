package InterpreterPattern;

import java.util.ArrayList;

import java.util.Iterator;

public class Demo {
	public static void main(String[] args) {
		String roman="MCMXXV";
		Context context=new Context(roman);
		ArrayList<Expression> expressions=new ArrayList<Expression>();
		expressions.add(new UnitExpression());
		expressions.add(new TenExpression());
		expressions.add(new HundredExpression());
		expressions.add(new ThousandExpression());
		Iterator<Expression> iterator=expressions.iterator();
		while(iterator.hasNext()) {
			Expression exp=iterator.next();
			exp.interpret(context);
		}
		System.out.println(roman + " = " + Integer.toString(context.getOutput()));
		
		
		
	}
}
