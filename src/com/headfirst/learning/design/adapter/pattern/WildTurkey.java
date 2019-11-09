package com.headfirst.learning.design.adapter.pattern;

public class WildTurkey implements Turkey {

	@Override
	public void gooble() {
		System.out.println("Wild Turkey is Quacking implementing Turkey Interface");
	}

	@Override
	public void fly() {
		System.out.println("Wild Turkey is Flying implementing Turkey Interface");
	}

}
