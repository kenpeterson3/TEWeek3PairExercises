package com.techelevator;

public class HourlyWorker implements WorkerInterface {
	
	private String firstName;
	private String lastName;
	private double hourlyRate;

	
	// constructor
	public HourlyWorker(double hourlyRate) {
		
		this.hourlyRate = hourlyRate;
		
	}
	
	@Override
	public double calculateWeeklyPay(int hoursWorked) {
		double pay = hourlyRate * hoursWorked;
		
		if (hoursWorked > 40) {
			pay += (hoursWorked - 40) * hourlyRate * 0.5;
		}
		
		return (hoursWorked > 0) ? pay : 0;
	}
	//getters and setters
	public double gethourlyRate() {
		return hourlyRate;
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
