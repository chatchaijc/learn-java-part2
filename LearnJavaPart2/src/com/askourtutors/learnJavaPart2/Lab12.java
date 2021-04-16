package com.askourtutors.learnJavaPart2;

public class Lab12 {
	// CompareStrings
	public static void main(String[] args) {
		String String1 = "You and Me";
		String String2 = " you and me ";
		String String3 = "   Google   ";
		String check = "You";
		String check2 = "you";
		if (String1.equals(String2))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");// not equal
		// ContainStrings
		System.out.println(String1.contains(check));// true
		System.out.println(String1.contains(check2));// false
		// LengthStrings
		System.out.println("String1 length :" + String1.length());
		// SubstringStrings
		System.out.println("Word cut : " + String1.substring(1, 4));
		// TrimStrings
		System.out.println("Before : " + String3);
		System.out.println("After : " + String3.trim());
		// UpperCaseStrings
		System.out.println("Upper case : " + String2.toUpperCase());
		// UpperCase&TrimStrings
		System.out.println("Before :" + String2);
		System.out.println("After :" + String2.trim().toUpperCase());
		
	}
}
