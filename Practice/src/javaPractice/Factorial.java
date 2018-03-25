package javaPractice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Enter num:-");
		Scanner sc = new Scanner(System.in);
		Integer n = sc.nextInt();
		findFactorial(n);

	}

	public static void findFactorial(Integer n) {
		int i, fact = 1;

		for (i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + n + " is: " + fact);
	}
}


