package com.headfirst.learning.design.builder.pattern;

public class BuilderSimulator {

	public static void main(String[] args) {
		Employee employee = new Employee.EmployeeBuilder("Harisudhan", "Manivannan")
				.age(25)
				.build();
		
		System.out.println(employee);
		
		employee = new Employee.EmployeeBuilder("Hari", "Mani")
				.build();
		
		System.out.println(employee);
	}
}
