package mginham_lab03;

import java.util.Scanner;

public class mginham_lab03_q2 {

	public static void displayStudentInfo() {
		// Display information & question to user
		System.out.println("****************************"
					   + "\nES1036: Lab 03 Q2"
					   + "\n		Inverse Tangent"
					   + "\nDate: October 18, 2018"
					   + "\nName: Megan Ginham"
					   + "\nStudent Number: 251029381"
					   + "\nMission: Approximate the"
					   + "\n		 inverse tangent of"
					   + "\n		 a number input by"
					   + "\n		 the user"
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
	
	public static double calcInverseTan(double value) {
		int iterations = 200, expo = 0; // iterations is an arbitrary value -> affects precision
		double result = value; // accounts for first (n=0) iteration of summation
		
		for(int n = 1; n <= iterations; n++) {
			expo = 2*n+1;
			
			result += (computePower(-1,n))*(computePower(value,expo)/expo);
		}
		
		return result;
	} // end calcInverseTan
	
	public static void main(String[] args) {
		
		// Declare and initialize variables
		Scanner input = new Scanner(System.in);
		double valInput = 0, result = 0;
		String userInput;
		
		displayStudentInfo();
		
		do {
			do {
				// Prompt user to input a real number (val in radians)
				System.out.println("Enter a value to compute the inverse tangent (-1 to 1): ");
					valInput = input.nextDouble();
					
				if(valInput < -1 || valInput > 1) // If input is invalid, inform user
					System.out.println("Invalid input! Please try again");
			} while(valInput < -1 || valInput > 1); // Validate the input is b/t -1 and 1 (inclusive)
				
			// Calculate the inverse tangent
			result = calcInverseTan(valInput);
			
			// Display the result
			System.out.println("The result is: " + result);
			
			System.out.println("Would you like to continue? (y/n)"); // Assume user will enter a valid input
				userInput = input.next();
		} while(userInput.equals("y")); // Loop while user indicates they wish to
		
		System.out.println("\nGoodbye!");
		
		input.close();
	} // end main

} // end class
