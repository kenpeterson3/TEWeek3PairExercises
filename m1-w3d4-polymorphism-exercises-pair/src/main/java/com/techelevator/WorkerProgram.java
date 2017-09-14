package com.techelevator;

import java.util.concurrent.ThreadLocalRandom;

public class WorkerProgram {
	
	public static void main (String[] args) {
		
		int totalHours = 0;
		double totalPay = 0.00;
		
		SalaryWorker howardMoe = new SalaryWorker(52000);
			howardMoe.setFirstName("Moe");
			howardMoe.setLastName("Howard");
			
		HourlyWorker fineLarry = new HourlyWorker(100);
			fineLarry.setFirstName("Larry");
			fineLarry.setLastName("Fine");
			
		VolunteerWorker howardJerome	 = new VolunteerWorker();
			howardJerome.setFirstName("Jerome (Curly)");
			howardJerome.setLastName("Howard");
			
		WorkerInterface[] corporateStooges = new WorkerInterface[] {howardMoe, fineLarry, howardJerome};
		
		
		System.out.print(String.format("%-25s", "Employee"));
		System.out.print(String.format("%-15s", "Hours Worked"));	
		System.out.println("Pay");	
		
		
		for (WorkerInterface stooge: corporateStooges ) {
			int randomHours = ThreadLocalRandom.current().nextInt(20,81);
			System.out.print(String.format("%-25s", stooge.getLastName() + ", " + stooge.getFirstName()));
			System.out.print(String.format("%-15d", randomHours));	
			System.out.println( "$" + String.format("%.2f",stooge.calculateWeeklyPay(randomHours)));	
			totalHours += randomHours;
			totalPay += stooge.calculateWeeklyPay(randomHours);
		}
		System.out.println();
		System.out.println("Total Hours: " + totalHours);
		System.out.println("Total Pay: $" + String.format("%.2f", totalPay));
		
	}
}
