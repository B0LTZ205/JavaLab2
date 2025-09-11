package Lab1;

import java.util.Scanner;

public class userInfo {
	public static void main(String[] args) {
		System.out.println("Hello, my name is Calvin.");
		System.out.println("My favorite color is green");
		System.out.println("The current year is 2025");
		
		// assigning a constant for pi and radius
		final double PI = 3.14159;
		final int radius = 5;
		
		double area = PI * radius * radius;
		System.out.println("\nThe area of a circle with a radius of 5 is " + area + ".\n");
		
		Scanner myScanner = new Scanner(System.in);

		System.out.print("Enter your age:");
		int userAge = myScanner.nextInt();
		
		System.out.print("What is your height in meters: ");
		float userHeight = myScanner.nextFloat();
		
		System.out.print("What is your favorite letter: ");
		String userLetter = myScanner.next();
		String upperUserLetter = userLetter.toUpperCase();
		
		System.out.print("Do you like progamming? (Y/N): ");
		String programChoice = myScanner.next();
				
		
		
		System.out.println("\nI am " + userAge + " years old.");
		System.out.println("My height is " + userHeight + " meters.");
		System.out.println("My favorite letter is " + upperUserLetter + ".");
		
		if (programChoice.equalsIgnoreCase("Y")) {
			System.out.println("Do I like programming? True");
		} else {
			System.out.println("Do I like programming? False");
		}
		
		System.out.print("\nEnter Name: ");
		String name = myScanner.next();
		
		System.out.print("Enter Population of city: ");
		long city = myScanner.nextLong();
		
		System.out.print("Enter current temperature in celsius: ");
		double temp = myScanner.nextDouble();
		
		System.out.print("Are you a student (Y/N): ");
		String student = myScanner.next();
		boolean isStudent = student.equalsIgnoreCase("Y");
		
		System.out.println("\nThe person's name is " + name + ".");

		System.out.println("The population of the city is " + city + ".");

		System.out.println("The temperature is " + temp + " degrees celsius.");

		System.out.println("Is the person a student? " + isStudent);
			
		
		
	myScanner.close();

	}
}
