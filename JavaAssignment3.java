package com.practice.assignments;

public class JavaAssignment3 {
	
public static void main(String[] args) {
		
//Step 1 : Create an array of the following values "Netflix", "Hulu", "Amazon Prime", "Disney Plus".
			String[] streaming = {"Netflix", "Hulu", "Amazon Prime", "Disney Plus", "Peacock"};
//Step 2: Change the 3rd element in the index to "HBO Max".
			streaming[2] = "HBO Max";
			System.out.println(streaming[2]);
//Step 4: If the 2nd element in the array is "Amazon Prime" then print "True" 
			if(streaming[1] == "Amazon Prime")
			{
				System.out.println("True");
			}
			else
			{
				System.out.println("False, Second element is Hulu");
			}
//Step 4: Loop through all array elements to print each element. 
			for (int i = 0; i < streaming.length; i++) {
				System.out.println(streaming[i]);
			}
//Step 5: Create a two-dimensional array with the values {5,2,6,7},{3,6,7,1}
			int[][] myNums = {{5,2,6,7},{3,6,7,1}};
//Step 6: Print the value of 2 and 3 using the two-dimensional array
			int x = myNums[1][0];
			int y = myNums[0][1];
			System.out.println(x + y);
	
}


}
