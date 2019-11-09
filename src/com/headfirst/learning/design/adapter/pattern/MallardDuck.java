package com.headfirst.learning.design.adapter.pattern;

public class MallardDuck implements Duck {

	@Override
	public void quack() {
		System.out.println("Mallard Duck is Quacking implementing Duck Interface");
	}

	@Override
	public void fly() {
		System.out.println("Mallard Duck is Flying implementing Duck Interface");
	}

}
