package com.techelevator;

public class SalaryWorker implements WorkerInterface {
	
	private String firstName;
	private String lastName;
	private double annualSalary;
	
	// constructor
	public SalaryWorker(double annualSalary) {
		
		this.annualSalary = annualSalary;
		
	}
	
	@Override
	public double calculateWeeklyPay(int hoursWorked) {
		return annualSalary / 52 ;
	}
	//getters and setters
	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String getFirstName() {
		return firstName;
	}

	@Override
	public String getLastName() {
		return lastName;
	}

}
