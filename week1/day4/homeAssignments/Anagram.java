package week1.day4.homeAssignments;

import java.util.Arrays;

public class Anagram {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initialize variable
		String text1 = "stops";
		String text2 = "potss";
		
		//converting string to array of char and sorting
		char[] charArray1 = text1.toCharArray();
		Arrays.sort(charArray1);
		char[] charArray2 = text2.toCharArray();
		Arrays.sort(charArray2);
		
		//check if 2 arrays are equal
		boolean equals = Arrays.equals(charArray1, charArray2);
		if(equals)
		{
			System.out.println("The given strings are Anagram.");
			
		}
		else {
			{
				System.out.println("The given strings are not an Anagram.");
			}
		}

	}

}
