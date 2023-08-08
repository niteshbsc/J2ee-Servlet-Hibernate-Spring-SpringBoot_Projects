package org.SelfPractise06;

import java.util.Scanner;

public class ArmStrongNumber {

	public static int countDigit(int n) {
		int count=0;
		do {
			count++;
			n=n/10;
		}while(n!=0);
		return count;
	}
	public static int pow(int n, int p) {
		int pw=1;
		while(p>0) {
			pw=pw*n;
			p--;
		}
		return pw;
	}
	public static boolean isarmstrong(int a) {
		int dc=countDigit(a);
		int sum=0, temp=a;
		while(a!=0) {
			int r=a%10;
			sum=sum+pow(r,dc);
			a=a/10;
		}
		return sum==temp;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean rs=isarmstrong(n);
		if(rs==true) {
			System.out.println("Armstrong");
		}
		
	}

}
