/*
 *	Author: Jonah Choe
 *  Date: 10/22/24
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		
		
		Employee Dwight = new Employee(1987,"Dwight", "Schrute", 4416.66);
		Dwight.employeeToString();
		
		Employee Jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		Jim.employeeToString();
		
		Employee Pam = new Employee(2011, "Pam","Beesly", 2250.0);
		Pam.employeeToString();
		
		Employee Joquavious = new Employee(2463, "Joquavious", "Da Dinky", 10000.0);
		Joquavious.employeeToString();

		michael.raiseSalary(1);
		System.out.println("Michael's montly salary "+michael.getSalary());
		System.out.println("Michael's yearly salary "+michael.getAnnualSalary());
		
		Dwight.raiseSalary(2);
		System.out.println("Dwight's montly salary "+Dwight.getSalary());
		System.out.println("Dwight's yearly salary "+Dwight.getAnnualSalary());
		
		Jim.raiseSalary(3);
		System.out.println("Jim's monthly salary "+Jim.getSalary());
		System.out.println("Jim's yearly salary "+Jim.getAnnualSalary());
		
		Pam.raiseSalary(2);
		System.out.println("Pam's monthly salary "+Pam.getSalary());
		System.out.println("Pam's yearly salary "+Pam.getAnnualSalary());
		
		Joquavious.raiseSalary(15);
		System.out.println("Joquavious's monthly salary "+Joquavious.getSalary());
		System.out.println("Joquavious's yearly salary "+Joquavious.getAnnualSalary());
		
		
		
		
	}
}
