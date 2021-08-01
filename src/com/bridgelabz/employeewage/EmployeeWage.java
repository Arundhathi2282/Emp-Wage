package com.bridgelabz.employeewage;

import java.util.Random;

public class EmployeeWage {
	private static final int WAGE_PER_HR = 20;

	public static void main(String args[]) {
		Random random = new Random();
		int totalSalary = 0;
		int workingHrs, numOfHrs=0, numOfDays =0;
		for (int i = 0; i < 20; i++) {
			int attendanceCheck = random.nextInt(3);
			switch (attendanceCheck) {
			case 1:
				workingHrs = 8;
				break;
			case 2:
				workingHrs = 4;
				break;
			default:
				workingHrs = 0;
			}
			int salary = WAGE_PER_HR * workingHrs;
			totalSalary = totalSalary + salary;
			numOfHrs +=workingHrs;
			numOfDays+=1;
			if(numOfDays == 20 || numOfHrs == 100){
			    System.out.println("Employee salary for a month is : "+totalSalary);
			    break;
			}
		}
	}
}
