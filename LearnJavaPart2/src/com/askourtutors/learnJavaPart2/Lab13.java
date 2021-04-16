package com.askourtutors.learnJavaPart2;

public class Lab13 {
	public static void main(String[] args) {
		int[][] twoDiArray = { { 1, 2, 4 }, { 5, 6, 7, 8 }, { 9, 10 } };
// print all element
		for (int[] row : twoDiArray) {
			for (int element : row) {
				System.out.println(element);
			}
		}
// print last element
		int sum = 0, lastElement = 0;
		for (int roww = 0; roww < twoDiArray.length; roww++) {

			lastElement = twoDiArray[roww][(twoDiArray[roww].length) - 1];
			sum += lastElement;

		}

		System.out.println("Sum last element of two dimention array : " + sum);

	}

}
