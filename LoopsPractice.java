package com.practice.testcases;

import java.util.ArrayList;
import java.util.Scanner;

public class LoopsPractice {

	public static void main(String[] args) {
		
		String sentence = " My name is Slim Shady.";
		Scanner scan = new Scanner(sentence);
		ArrayList<String> words = new ArrayList<String>();
		
		while(scan.hasNext()) {
			words.add(scan.next());
		}
		
		System.out.println(words);
	}
}


