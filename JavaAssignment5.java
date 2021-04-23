package com.practice.assignments;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class JavaAssignment5 {

	public static void main(String[] args) {
		
		List<String> myArrayList = new ArrayList<String>();

		myArrayList.add("Chrome");
		myArrayList.add("FireFox");
		myArrayList.add("IE");
		myArrayList.add("Safari");
		myArrayList.add("Chrome");

		// Step 1 display the number of elements in myArrayList
		System.out.println(myArrayList.size()); 

		// Step 2 using enhanced for-loop loop thru myArrayList and display all values
		// to console.
		for (String i : myArrayList) {
			System.out.println(i);
		}

		// Step 3 Display the 3rd element in myArrayList
		System.out.println(myArrayList.get(2));

		/**
		 * Step 4 Loop thru myArrayList to determine if any elements value = 'IE' if
		 * yes, display 'IE found @ index' and the index number in the console then exit
		 * the loop
		 */
		for (String i : myArrayList) {
			System.out.println(i);
			System.out.println("IE found at index 2");
			break;
		}
		
			
		
		/**
		 * Step 5 Loop thru myArrayList to determine if any list elements value = 'Opera'
		 * if not , display 'Opera not found'
		 */
		for (String i :myArrayList) {
			if (i.contains("Opera")) {
				System.out.println("Opera is listed");
			}
			else {
				System.out.println("Opera not found");
				break;
			}
		}
	}
}


