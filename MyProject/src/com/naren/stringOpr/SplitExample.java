package com.naren.stringOpr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SplitExample {
	public static void main(String args[]) {
		String s1 = "35,700,7,98,1000,1,200,88";
		String[] words = s1.split(","); // splits the string based on comma
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		for (String w : words) {
			System.out.println(w);
			numbers.add((Integer.parseInt(w)));
		}

		System.out.println("=============================");
		Collections.sort(numbers);

		for (Integer n : numbers) {
			System.out.println(n);
		}
	}
}