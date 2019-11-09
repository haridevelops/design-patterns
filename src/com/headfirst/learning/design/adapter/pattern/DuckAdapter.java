package com.headfirst.learning.design.adapter.pattern;

public class DuckAdapter implements Turkey {

	Duck duck;
	
	public DuckAdapter(Duck duck) {
		this.duck = duck;
	}
	
	@Override
	public void gooble() {
		duck.quack();
	}

	@Override
	public void fly() {
		duck.fly();
	}

}
