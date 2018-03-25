package javaPractice;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("Enter number:-");
		Scanner sc=new Scanner(System.in);
		Integer n=sc.nextInt();
		palindrome(n);
	}
public static void palindrome(Integer n) {
	
	int rev=0,temp=n;
	while(n!=0) {
		
		rev=(rev*10)+(n%10);
		n=n/10;
	}
	
	if (temp==rev) {
		System.out.println("number is palindrome");
	}
	
	else {
		System.out.println("number is not palindrome");
	}
}

}
