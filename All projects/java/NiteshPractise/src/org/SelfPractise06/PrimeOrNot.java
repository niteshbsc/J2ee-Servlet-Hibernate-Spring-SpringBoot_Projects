package org.SelfPractise06;

import java.util.Scanner;

public class PrimeOrNot {

	public static boolean check(int n) {
		for(int i=2;i<=n/2;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		boolean rs=check(n);
		if(rs==true) {
			System.out.println("Prime no.");
		}
		else {
			System.out.println("Not a prime no.");
		}
//		int count=0;
//		
//		for(int i=2;i<=n;i++) {
//			boolean rs=check(i);
//			if(rs==true)	
//				count++;
//			
//		}
//		System.out.println(count);
	}

}
