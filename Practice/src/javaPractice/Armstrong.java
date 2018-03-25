package javaPractice;

import java.util.Scanner;

/**
 * @author User
 *
 */
public class Armstrong {
    
	
	public static boolean armstrong(int num){
		Boolean flag;
		int sum=0,temp=0,r=num;
		while(num>0){
		temp=num%10;
		sum+=temp*temp*temp;
		num=num/10;
		}
		if(sum==r){
		return flag=true;}
		else {
		return flag=false;
	}}
	public static void main(String args[]) {
		int input;
		Boolean flag;
		System.out.println("Enter any digit:");
		Scanner sc=new Scanner(System.in);
		input=sc.nextInt();
		flag=Armstrong.armstrong(input);
		if(flag){
			System.out.println("Number is armstrong");
		}
		else{
			System.out.println("Number is not armstrong");
		}
	}
}

