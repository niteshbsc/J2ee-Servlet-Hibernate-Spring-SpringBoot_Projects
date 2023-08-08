package org.SelfPractise06;

import java.util.Scanner;

public class BinaryToDecimal {

	static int bintodec(int bin) {
		int dec=0, pw=1;
		do {
			int b=bin%10;
			dec=dec+b*pw;
			pw=pw*2;
			bin=bin/10;
		}while(bin!=0);
		return dec;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rs=bintodec(n);
		System.out.println(rs);
	}

}
