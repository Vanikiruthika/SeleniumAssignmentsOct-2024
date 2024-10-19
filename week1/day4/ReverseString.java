package week1.day4;

public class ReverseString {
	public static void main(String[] args) {
		//create a variable
		String name = "Vanikiruthika";
		
		//normal printing the string
		System.out.println(name);
		
		//creating a char array
		char[] charArray = name.toCharArray();
		
		//printing the char array
		System.out.println(charArray);
		
		//Reverse the string and print the value
		for(int i=charArray.length-1; i>=0 ; i--)
		{
			System.out.print(charArray[i]);
		}
	}

}
