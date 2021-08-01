package com.bridgelabz.employeewage;

import java.util.Random;

public class EmployeeWage {
	public static void main(String args[]) {
		Random random = new Random();
		int attendanceCheck = random.nextInt(3);
		final int IS_PRESENT = 1;
		if(attendanceCheck == IS_PRESENT){
		    System.out.print("Employee is Present");
		}else {
		    System.out.print("Employee is Absent");
		}
	}
}
