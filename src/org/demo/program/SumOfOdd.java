package org.demo.program;

public class SumOfOdd {

	public static void sumOdd(int num) {

		int sum = 0;

		for (int i = 1; i <= num; i++) {

			if (i % 2 != 0) {

				sum = sum + i;

			}
			System.out.println("Sum of dd number is:" + sum);
		}

	}

	public static void main(String[] args) {

		sumOdd(10);
	}
}
