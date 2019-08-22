package org.demo.program;

public class Fibanoci {

	public static void fibo() {

		int n = 10, a = 0, b = 1, sum = 0;

		for (int i = 0; i <= n; i++) {

			sum = a + b;
			a = b;
			b = sum;

			System.out.println("fibo number is" + a);

		}

	}

	public static void main(String[] args) {

		fibo();
	}
}
