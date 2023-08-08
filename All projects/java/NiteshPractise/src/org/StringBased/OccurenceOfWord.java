package org.StringBased;

import java.util.Scanner;

public class OccurenceOfWord {

	public static void main(String[] args) {
		String str,word;
		int wordslen,i,count,j,k;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		str=sc.nextLine();
		String words[]=str.split("");
		wordslen=words.length;
		System.out.println("Occurence of the Each Word");
		for(i=0;i<wordslen;i++) {
			word=words[i];
			count=1;
			for(j=(i+1);j<(wordslen-1);j++) {
				if(word.equals(words[j])) {
					count++;
					for(k=j;k<(wordslen-1);k++) {
						words[k]=words[k+1];
					}
					wordslen--;
					j--;
				}
			}
			System.out.println(word+"Occurse"+count);
			count=0;
		}
	}
}
