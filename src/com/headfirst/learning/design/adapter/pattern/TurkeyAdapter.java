package com.headfirst.learning.design.adapter.pattern;

public class TurkeyAdapter implements Duck {

	Turkey turkey;
	
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}
	
	@Override
	public void quack() {
		turkey.gooble();
	}

	@Override
	public void fly() {
		turkey.fly();
	}

}
