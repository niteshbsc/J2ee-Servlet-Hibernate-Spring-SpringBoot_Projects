package org.SelfPractise06;

import java.util.Scanner;

public class DecimalToBinary {

	static String dectobin(int dec) {
		String bin=" ";
		do {
			int r=dec%2;
			bin=r+bin;
			dec=dec/2;
		}while(dec!=0);
		return bin;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int dc=sc.nextInt();
		String bn=dectobin(dc);
		System.out.println("Binary is equivalent to " +bn);
	}

}
