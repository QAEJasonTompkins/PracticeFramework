package com.practice.assignments;

import java.util.HashMap;
import java.util.HashMap;
import java.util.List;

public class JavaAssignment6 {
	
	public static void main(String[] args) {
		

		//declare a HashMap called myHashMap with an Integer Key and String value.
		HashMap<Integer, String> myHashMap = new HashMap<Integer, String>();

		/*
		 * Step 1 Load the following into ' myHashMap'
		 * 
		 * Key: = 1 Value: = "Ariana Grande" 
		 * Key: = 2 Value: = "Khalid" 
		 * Key: = 3 Value: = "Drake"
		 */
		myHashMap.put(1, "Ariana Grande");
		myHashMap.put(2, "Khalid");
		myHashMap.put(3, "Drake");
		myHashMap.put(4, "Tame Impala");
		

		// Step 2 Display to console the value associated with key 2
		System.out.println(myHashMap.get(2));

		// Step 3 Display the number of elements in myHashMap
		System.out.println(myHashMap.size());

		// Step 4 Remove the last element in myHashMap and display the number of
		// elements in myHashMap
		myHashMap.remove(4);
		System.out.println(myHashMap.size());
	}

}
