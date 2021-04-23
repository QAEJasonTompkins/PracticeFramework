package com.practice.assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class JavaAssignment7 {

	public static void main(String[] args) {
		
		// * Step 1 Create a HashSet of String objects called myHashSet
		HashSet<String> myHashSet = new HashSet<String>();

				/*
				 * Step 2 add the following String object A to myHashSet "New York" "Florida" "Maine"
				 * "Lousiana" "Colorado"
				 */
					myHashSet.add("New York");
					myHashSet.add("Florida");
					myHashSet.add("Maine");
					myHashSet.add("Louisiana");
					myHashSet.add("Colorado");
					myHashSet.add("Texas");

				/*
				 * Step 3 Display to console all the values of myHashSet ... hint use iterator
				 */
					Iterator<String> it = myHashSet.iterator();
					while(it.hasNext()) {
						System.out.println(it.next());
					}

				// Step 4 Remove from myHashSet where String = 'Florida"
					myHashSet.remove("Florida");
					System.out.println(myHashSet);

				// Step 5 Display to console the number of elements in myHashSet
					System.out.println(myHashSet.size());

	}

}
