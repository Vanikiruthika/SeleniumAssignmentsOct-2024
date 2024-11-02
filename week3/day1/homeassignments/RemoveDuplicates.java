package week3.day1.homeassignments;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String text = "We learn Java basics as part of java sessions in java week1";
		
		//Split the text into an array of words using space as the delimiter
		String[] split = text.split(" ");
		int count=0;
		//Create two nested for loops to compare each word with every other word in the String array.
		for(int i =0; i< split.length; i++)
		 {
			for(int j=i+1 ; j< split.length; j++)
			{
				
				boolean equals = split[i].equalsIgnoreCase(split[j]);
				
				//If a duplicate word is found, it is replaced with an empty string and the count is incremented.
				if(equals)
				{
				split[j] = "";
				count++;
				}
			}
		}
		if(count>0)
		{
		for(String i : split)
		{
		System.out.print(i + " ");
		}
		}
	}

}
