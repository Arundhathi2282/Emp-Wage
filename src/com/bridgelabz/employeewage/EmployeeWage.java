package com.bridgelabz.employeewage;

import java.util.Random;

public class EmployeeWage {
	public static void main(String args[]) {
		Random random = new Random();
		int attendanceCheck = random.nextInt(3);
		final int IS_FULL_TIME_PRESENT = 1;
		final int IS_PART_TIME_PRESENT = 2;
		final int WAGE_PER_HR = 20;
		int workingHrs;
		if(attendanceCheck == IS_FULL_TIME_PRESENT){
		    System.out.print("Employee is Full Time Present");
		    workingHrs = 8;
		}else if (attendanceCheck == IS_PART_TIME_PRESENT){
		    System.out.print("Employee is Part time Present");
		    workingHrs = 4;
		}else {
		    System.out.print("Employee is Absent");
		    workingHrs = 0;
		}
		int salary = WAGE_PER_HR * workingHrs;
		System.out.println(" and his salary is : "+salary);
	}
}
