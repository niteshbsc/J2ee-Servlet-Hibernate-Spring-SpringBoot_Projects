package org.BufferZero;

public class LcmOfTwoNumber {

	public static void main(String[] args) {
		int a=72,b=120,  gcd=1;
		for(int i=1;i<a && i<b;i++) {
			if(a%i==0 && b%i==0)
				 gcd=i;
		}
			int lcm=(a*b)/gcd;
			System.out.printf("%d",lcm);	
	}

}
