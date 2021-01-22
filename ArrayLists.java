package com.practice.testcases;

import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {
		String[] fruits = new String[4];
		fruits[0] ="Mango";
		fruits[1] ="Pineapple";
		fruits[2] ="Raspberry";
		fruits[3] ="Watermelon";
		System.out.println(fruits[1]);
		
		ArrayList fruitList = new ArrayList();
		fruitList.add("Mango");
		fruitList.add("Pineapple");
		fruitList.add("Raspberry");
		fruitList.add("Watermelon");
		
		fruitList.remove("Mango");
		System.out.println(fruitList.contains("Kiwi"));
		
		System.out.println(fruitList);
		}

}
