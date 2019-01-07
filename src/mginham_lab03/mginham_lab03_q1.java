package mginham_lab03;

import java.util.Scanner;

public class mginham_lab03_q1 {

	public static void displayStudentInfo() {
		// Display information & question to user
		System.out.println("****************************"
					   + "\nES1036: Lab 03 Q1"
					   + "\n        Power Computation"
					   + "\nDate: October 18, 2018"
					   + "\nName: Megan Ginham"
					   + "\nStudent Number: 251029381"
					   + "\nMission: Compute a power"
					   + "\n         given an operand"
					   + "\n         and an integer"
					   + "\n         power value"
					   + "\n****************************");
	} // end displayStudentInfo
	
	public static double computePower(double base, int power) {
		double result = base;
		boolean negPower = false;
		
		// Calculate the result
		if(power == 0) // Any base to the power zero is equal to one
			result = 1;
		else {
			if(power < 0) {
				negPower = true;
				power *= -1;
			}
			
			for(int i = 1; i < power; i++)
				result *= base;
			
			if(negPower)
				result = 1/result;
		}
		
		return result;
	} // end computePower
	
	public static void main(String[] args) {
		// Declare and initialize variables
		Scanner input = new Scanner(System.in);
		int power = 0;
		double base = 0, result = -1;
		
		displayStudentInfo();
		
		// Prompt user to input a real # base
		System.out.println("Please enter a real number base: ");
			base = input.nextDouble();
		
		// Prompt user to input a value for the power (assume user will enter an int)
		System.out.println("Please enter an integer exponent: ");
			power = input.nextInt();
		
		// Compute the result from the inputed values 
		result = computePower(base, power);
		
		// Display result to user
		System.out.println("The result is: " + result);
		
		input.close();
	} // end main

} // end class
