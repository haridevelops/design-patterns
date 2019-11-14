package com.headfirst.learning.design.factory.pattern;

public class LifeInsurance extends Insurance {

	public LifeInsurance() { }
	
	@Override
	public long getPremium() {
		return 2000;
	}

	@Override
	public String getInsuranceName() {
		return "Life Insurance";
	}

	@Override
	public long getTenure() {
		return 3;
	}

}
