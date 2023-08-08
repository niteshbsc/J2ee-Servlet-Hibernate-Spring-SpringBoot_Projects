package org.SelfPractise06;

import java.util.Scanner;

public class XylemOrNot {

	
		static String checkxp(int x) {
			int os=0, ms=0, temp=x;
			do {
				int d=x%10;
				if(temp==x || d==x)
					os=os+d;
				else
					ms=ms+d;
			}while(x!=0);
			if(os==ms)
				return "xylem";
			else
				return "phylem";
		}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Number");
			int n=sc.nextInt();
			String st=checkxp(n);
			System.out.println(n+"is a"+st+ "number");
	}

}
