package mginham_lab03;

import java.util.Scanner;

public class mginham_lab03_q3 {

	public static void displayStudentInfo() {
		// Display information & question to user
		System.out.println("****************************"
					   + "\nES1036: Lab 03 Q3"
					   + "\n        Employee Class"
					   + "\nDate: October 18, 2018"
					   + "\nName: Megan Ginham"
					   + "\nStudent Number: 251029381"
					   + "\nMission: Create a simple"
					   + "\n         class to hold data"
					   + "\n         for a company"
					   + "\n         employee"
					   + "\n****************************");
	} // end displayStudentInfo
	
	public static void main(String[] args) {
		// Declare and initialize variables
		Scanner input = new Scanner(System.in);
		String fName = "", lName = "";
		int salary = -1;
		
		displayStudentInfo();
		
		// Prompt the user for employee info
		System.out.println("Enter the employee's first name: ");
			fName = input.next();
		System.out.println("Enter the employee's last name: ");
			lName = input.next();
		System.out.println("Enter the employee's salary: ");
			salary = input.nextInt();
		
		// Create employee -> call Employee class
		Employee theOne = new Employee(fName,lName,salary); // theOne is an arbitrary reference name given to the employee
		
		// Display employee info to user
		theOne.printInfo();

		System.out.println("\nGoodbye!");
		
		input.close();
	} // end main

} // end class
