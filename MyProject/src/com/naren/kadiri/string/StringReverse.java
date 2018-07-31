package com.naren.kadiri.string;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string");
		String str = sc.nextLine();
		StringReverse sr = new StringReverse();

		System.out.println("String after Reverse is: " + sr.reverse(str));
	}

	private String reverse(String str) {
		if (str == null || str.isEmpty() || str.length() == 0)
			return str;
		System.out.println("subString is: " + str.substring(1) + ": charAt(0) is:" + str.charAt(0));
		return reverse(str.substring(1)) + str.charAt(0);
	}

}
