package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;


public class SetPractice {
	public static void main(String[] args) {
		String companyName = "google";
		char[] nameArray= companyName.toCharArray();
		
		Set<Character> setName = new LinkedHashSet<Character>();
		for(int i=0;i<nameArray.length;i++)
		{
			setName.add(nameArray[i]);
			
		}
		System.out.println(setName);
		
	}

}
