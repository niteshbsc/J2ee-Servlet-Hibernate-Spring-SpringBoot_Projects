package org.SelfPractise06;

import java.util.Scanner;

public class PerfectNumber {

	public static boolean isperfect(int n) {
		int sum=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0)
			   sum= sum+i;
		}
		return sum==n;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		for(int i=2;i<=x;i++) {
		boolean rs=isperfect(i);
		if(rs==true)
			System.out.println(i+" ");
		}
	}

}
