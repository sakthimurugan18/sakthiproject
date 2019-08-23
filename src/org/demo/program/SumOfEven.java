package org.demo.program;

public class SumOfEven {

	public static void sumEven(int num) {

		int sum = 0;
		for (int i = 2; i <= num; i++) {

			if (i % 2 == 0) {

				sum = sum + i;

				System.out.println("Sum of Even number is:" + sum);
			}
//			} else {
//
//				System.out.println("This not Even Number");
//
//			}
		}

	}

	public static void main(String[] args) {

		sumEven(20);
	}

}
