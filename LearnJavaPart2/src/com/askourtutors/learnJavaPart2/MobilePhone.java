package com.askourtutors.learnJavaPart2;

public class MobilePhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String voice = "Hello Voice";
		String message = "Hello Message";
		String inter_surf = "Hello Internet";
		phoneCall(voice);
		sMS(message);
		internetSurfing(inter_surf);

	}

	public static void phoneCall(String word_v) {
		System.out.println(word_v);
	}
	
	public static void sMS(String word_m) {
		System.out.println(word_m);
	}

	public static void internetSurfing(String word_i) {
		System.out.println(word_i);
	}
}
