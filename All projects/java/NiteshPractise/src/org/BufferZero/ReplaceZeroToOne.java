package org.BufferZero;

public class ReplaceZeroToOne {

	public static void main(String[] args) {
		long n=2098010;
		String str=Long.toString(n);
		String str1="";
		for (int i = 0; i <str.length(); i++) {
			if(str.charAt(i)=='0')
				str1=str1+1;
			else
				str1=str1+str.charAt(i);
		}
		System.out.println(str1);
	}

}
