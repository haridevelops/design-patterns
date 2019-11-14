package com.headfirst.learning.design.builder.pattern;

import java.util.Date;

public class Employee {
	private final String firstName;
	private final String lastName;
	private final String salary;
	private final Date dateOfBirth;
	private final int age;
	
	public Employee(EmployeeBuilder builder) {
		super();
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.salary = builder.salary;
		this.dateOfBirth = builder.dateOfBirth;
		this.age = builder.age;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getSalary() {
		return salary;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary + ", dateOfBirth="
				+ dateOfBirth + ", age=" + age + "]";
	}

	public static class EmployeeBuilder {
		private final String firstName;
		private final String lastName;
		private String salary;
		private Date dateOfBirth;
		private int age;
		
		public EmployeeBuilder(String firstName, String lastName) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
		}
		
		public EmployeeBuilder salary(String salary) {
			this.salary = salary;
			return this;
		}
		
		public EmployeeBuilder dateOfBirth(Date dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
			return this;
		}
		
		public EmployeeBuilder age(int age) {
			this.age = age;
			return this;
		}
		
		public Employee build() {
			Employee employee = new Employee(this);
			return employee;
		}
	}
		
}
