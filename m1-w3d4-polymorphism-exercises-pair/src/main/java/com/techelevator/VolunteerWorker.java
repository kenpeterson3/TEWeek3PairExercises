package com.techelevator;

public class VolunteerWorker implements WorkerInterface {
	
	private String firstName;
	private String lastName;
	
	// constructor
	public VolunteerWorker() {
		
	}
	
	@Override
	public double calculateWeeklyPay(int hoursWorked) {
		
		return 0;
	}
	//getters and setters

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
