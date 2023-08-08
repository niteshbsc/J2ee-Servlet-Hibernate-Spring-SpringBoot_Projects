package org.SelfPractise06;

import java.util.Scanner;

public class HappyNumber {

	static boolean isHappy(int x) {
		while(x>9) {
			int sum=0;
			while(x!=0) {
				int d=x%10;
				sum=sum+d*d;
				x=x/10;
			}
			x=sum;
		}
		return x==1 || x==7;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean rs=isHappy(n);
		if(rs==true)
			System.out.println("Happy number");
		else
			System.out.println("Not a Happy number");
	}

}
