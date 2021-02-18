package com.practice.testcases;

public class JavaAssignment2 {

	public static void main(String[] args) {
		/*
		NOTE: All variable should be in camelCase. 
		example:
		int myNumber is correct
		int MyNumber is not correct
		int MYNUMBER is not correct
		int mynumber is not correct 
		*/

		//create an integer and set it to the value of 7
		int myNum = 7;

		/*
		Create an else if statement with the following conditions

		condition1: if the number is negative then print
		"Number is negative"

		condition2: if the number is less then 5 then print 
		"Number is less than 5" 

		condition3: if the number is between 5 and 10 then print
		"Number is between 5 and 10" 

		condition4: if none of these match then print
		"Number is greater than 10"

		*/
		if (myNum<0) {
			System.out.println("Number is Negative");
		}
		else if (myNum < 5) {
			System.out.println("Number is less than 5");
		}
		else if (myNum >= 5 && myNum <= 10) {
			System.out.println("Number is between 5 and 10");
		}
		else {
			System.out.println("Number is greater than 10");
		}
		
		//create a for loop that prints the values between 1 and 10
		for(int i = 0; i <= 10; i++) {
			System.out.println(i);
			
		}
		//create a String variable and set to a value of "Elephant"
		String Animal = "Elephant";
		/*
		Create Switch statement with the following cases

		case "Lion" prints, "The animal is a Lion."

		case "Tiger" prints, "The animal is a Tiger."

		case "Zebra" prints, "The animal is a Zebra."
		
		default prints, "your animal is not listed"
		*/
		switch (Animal) {
			case "Lion":
				System.out.println("The animal is a Lion");
				break;
			case "Tiger":
				System.out.println("The animal is a Tiger");
				break;
			case "Zebra":
				System.out.println("The animal is a Zebra");
				break;
			case "Elephant":
				System.out.println("The animal is a Elephant");
				break;
			default:
				System.out.println("Your animal is not listed!");
		}




	}

}
