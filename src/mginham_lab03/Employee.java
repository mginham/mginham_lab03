package mginham_lab03;

public class Employee {
	
	// Declare and initialize class variables
	public static String m_firstName;
	public static String m_lastName;
	public static int m_salary;
	
	// Constructor
	public Employee(String fName, String lName, int salary) {
		m_firstName = fName;
		m_lastName = lName;
		m_salary = salary;
	} // end constructor
	
	// Displays employee info to user
	public void printInfo() {
		System.out.println("\nFirst Name: " + m_firstName
						 + "\nLast Name: " + m_lastName
						 + "\nSalary: " + m_salary);
	} // end printInfo
} // end class
