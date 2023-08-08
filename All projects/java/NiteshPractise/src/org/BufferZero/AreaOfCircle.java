package org.BufferZero;

import java.util.Scanner;

public class AreaOfCircle {

	public static double Area(int r) {
		return 3.14*(r*r);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Radius");
		int r=sc.nextInt();
		double res=3.14*(r*r);
		System.out.println(res);
//		System.out.println(Area(6));
	}

}
