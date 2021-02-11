package com.practice.testcases;

public class JavaAssignment {

	public static void main(String[] args) {
		//STRINGS

		//create a string variable called fName and set it to your first name
			String fName = "Jason ";
			System.out.println(fName);
		//create a int variable that stores the length of fname variable (use methods)
			int fNameLength = 5;
			System.out.println("First Name contains " + fNameLength + " characters");

		//create a string variable called lName and set it to your last name
			String lName = "Tompkins";
			System.out.println(lName);
		//create a string variable called fullName and set it to fName concatenated with lName
			String fullName = fName;
			System.out.println(fullName.concat(lName));
		//print fullName variable 
			System.out.println(fullName.concat(lName));

		//print fullName variable but use a string method to set it to all upper case. 
			System.out.println(fullName.concat(lName).toUpperCase());

		//print the 3rd index of fullName (you'll need to use charAt() method)
			char result = fullName.charAt(2);
			System.out.println(result);
		//create a string and set it to "   There are spaces in this sentences.   " 
			String txt = "  There are Spaces in this sentence.  ";
			
		//what method can we use to print the sentence without white spaces?
			System.out.println(txt.trim());



		//INTEGERS and Math

		//create an integer variable and set it to your age (give your own names moving foward).
			int jasonAge = 28;
		//create an if/else statement that prints "My age is over 25" if your age is over 25 or prints "My age is less than 25" if it is less than 25.
			if (jasonAge > 25) {
				System.out.println("My age is over 25");
			} else {
				System.out.println("My Age is less than 25");
			}
		//create an integer variable that stores your age multiplied by 2.
			int ageOfJason = 28 * 2;
			System.out.println("Jason's age times 2 is " + ageOfJason);
		//create an integer variable that is your age subtracted by 5. 
			int ageSub = 28 - 5;
			System.out.println("Jason's age minus 5 is  " + ageSub);	
		//print the remainder (modulo) between 15 divided by 6.
			int sum1 = 15 % 6;
			System.out.println("The remainder is " + sum1);
		//Print the following line "We're all in this." (how can we handle special characters in strings?)

		//store the value of 13 + 12.56 as a variable.
			int x = 13;
			double y = 12.56d;
			System.out.println("13 + 12.56 is " + (x + y));
			
			double Sum2 = 25.560000000000002d;
			System.out.println("This variable is " + Sum2);
					
		//how can we generate a random number between 0 and 1?
			System.out.println(Math.random());
	}

}
