package week3.day1.homeassignments;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		//Define two input strings.
		String text1 = "stops";
		String text2 = "potss";
		
		//Check if the lengths of the two strings are equal and if equal
		if(text1.length() == text2.length())
		{
			//Convert both the strings to character arrays
			char[] charArray1 = text1.toCharArray();
			char[] charArray2 = text2.toCharArray();
			//Sort both the character arrays
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			//Check if the sorted arrays are equal
			String t1 = String.valueOf(charArray1);
			String t2 = String.valueOf(charArray2);

			if(t1.equals(t2))
			//Check if the sorted arrays are equal
			//boolean equals = Arrays.equals(charArray1, charArray2);
			//if(equals)
			{
				System.out.println("The given strings are Anagram");
			}
			else {
				System.out.println("The given strings are not an Anagram");
			}
		}
		//If length if 2 strings not equal, print "Lengths mismatch, therefore the strings are not an Anagram" and exit.
		else {
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		}
	}

}
