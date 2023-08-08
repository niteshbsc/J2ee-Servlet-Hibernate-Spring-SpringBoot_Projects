package org.BufferZero;

import java.util.Scanner;

public class StringNumberOfOccurence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
//		String str="aaaBBBAAcc";
//		char ch='a';
//		int count=0;
//		for(int i=0;i<str.length();i++) {
//			if(str.charAt(i)==ch)
//				count++;
//		}
//		System.out.println(count);
		String str=sc.nextLine();
		int arr[]=new int[26];
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='a' && ch<='z') 
			arr[ch-97]++;
			
			else if(ch>='A' && ch<='Z') 
				arr[ch-65]++;
			
		}
		for(int i=0;i<26;i++) {
			if(arr[i]!=0)
				System.out.println((char)(i+65)+"->"+arr[i]);
		}
	
	}

}
