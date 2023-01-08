package com.patterns.strategies.pseudocode;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Context context = new Context(new ConcreteStrategyAdd());
		System.out.println("3 + 4 = " + context.executeStrategy(3, 4));

		context = new Context(new ConcreteStrategySubtract());
		System.out.println("5 - 6 = " + context.executeStrategy(5, 6));

		context = new Context(new ConcreteStrategyMultiply());
		System.out.println("8 * 9 = " + context.executeStrategy(8, 9));
	}

}
