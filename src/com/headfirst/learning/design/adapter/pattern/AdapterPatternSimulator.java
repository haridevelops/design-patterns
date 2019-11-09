package com.headfirst.learning.design.adapter.pattern;

public class AdapterPatternSimulator {

	public static void main(String[] args) {
		Duck duck = new MallardDuck();
		
		Turkey turkey = new WildTurkey();
		
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		
		testDuck(duck);
		
		testDuck(turkeyAdapter);
		
		Turkey duckAdapter = new DuckAdapter(duck);
		
		testTurkey(turkey);
		
		testTurkey(duckAdapter);
	}

	private static void testTurkey(Turkey turkey) {
		turkey.gooble();
		turkey.fly();
	}

	private static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
	
	
	
}
