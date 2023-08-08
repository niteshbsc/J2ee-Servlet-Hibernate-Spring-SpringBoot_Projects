package org.StringBased;

public class ReverseStringWordIsOdd {

	
	public static String reverseOddWord(String word) {
	    if (word.length() % 2 != 0) { // check if word has odd length
	        char[] chars = word.toCharArray(); // convert the word to a character array
	        int mid = chars.length / 2; // get the index of the middle character

	        // iterate over the first half of the characters and swap with corresponding characters in the second half
	        for (int i = 0; i < mid; i++) {
	            char temp = chars[i];
	            chars[i] = chars[chars.length - i - 1];
	            chars[chars.length - i - 1] = temp;
	        }
	        return new String(chars); // convert the character array back to a string and return
	    }
	    return word; // return the original word if it has an even length
	}

	public static void main(String[] args) {

	}

}
