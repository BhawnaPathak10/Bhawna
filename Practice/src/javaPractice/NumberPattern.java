package javaPractice;

import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args) {
		System.out.println("Enter Rows:-");
		Scanner sc=new Scanner(System.in);
		Integer n=sc.nextInt();
		numberPattern(n);
	}

	public static void numberPattern(Integer n) {
		int i,j,num;
		for ( i=0;i<n;i++) {
			num=1;
			for( j=0;j<=i;j++) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println(" ");
		}
		
	}

}
