package week3.day1.homeassignments;

public class OddIndexToUpperCase {
	public static void main(String[] args) {
		String test = "changeme";
		//Convert the given String to a character array.
		char[] charArray = test.toCharArray();
		
		//Implement a loop to iterate through each character of the String (from end to start).
		for(int i=0; i< test.length() ; i++)
		{
			//change the character to uppercase only if the index is odd
			if(i%2 != 0 )
			 
				{
					charArray[i] = Character.toUpperCase(charArray[i]);
				}
			
		}
		System.out.println(charArray);
		
	}

}
