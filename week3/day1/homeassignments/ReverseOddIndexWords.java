package week3.day1.homeassignments;


public class ReverseOddIndexWords {

	public static void main(String[] args) {
		String test = "I am a software tester";
		//Split the words and have it in an array
		String[] split = test.split(" ");
		//Traverse through each word using loop and Find the odd index within the loop
		for(int i=0;i< split.length;i++)
		{
			if(i%2 !=0)
			 {
				//Convert the String array into a character array
				char[] charArray = split[i].toCharArray();
				for(int j=charArray.length-1; j >=0 ; j--)
				{
					System.out.print(charArray[j]);
				}
			 }
			else {
				System.out.print(split[i]);
			}
			System.out.print(" ");
		}
		
		
		
	}

}


/*
 * String string = split[i]; 
 * String reverse = "";
 *  for(int j=0; j<string.length();j++) 
 *  { reverse = string.charAt(j) + reverse; } 
 *  split[i] = reverse;
 */