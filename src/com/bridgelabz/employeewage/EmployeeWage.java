package com.bridgelabz.employeewage;

import java.util.Random;

public class EmployeeWage {
	private static final int WAGE_PER_HR = 20;

	public static void main(String args[]) {
		Random random = new Random();
		int totalSalary = 0;
		int workingHrs;
		for (int i = 0; i < 20; i++) {
			int attendanceCheck = random.nextInt(3);
			switch (attendanceCheck) {
			case 1:  System.out.print("Employee is Full time Present");
				workingHrs = 8;
				break;
			case 2:  System.out.print("Employee is Part time Present");
				workingHrs = 4;
				break;
			default:  System.out.print("Employee is Absent");
				workingHrs = 0;
			}
			int salary = WAGE_PER_HR * workingHrs;
			System.out.println(" and his salary is : " + salary);
			totalSalary = totalSalary + salary;
		}
		System.out.println("Total Salary of an Employee for a month is : " + totalSalary);
	}
}
