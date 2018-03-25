package javaPractice;

import java.util.Scanner;

public class PyramidPattern {

	public static void main(String[] args) {
		System.out.println("Enter Rows:-");
		Scanner sc=new Scanner(System.in);
		Integer n=sc.nextInt();
		pyramid(n);
	}

	public static void pyramid(Integer n) {
		for (int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
	}
}
