package week3.day1.homeassignments;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sorting {
	public static void main(String[] args) {
		String[] companies ={"HCL", "Wipro", "Aspire Systems", "CTS"};
		List<String> companiesList = Arrays.asList(companies);
		Collections.sort(companiesList);
		System.out.println(companiesList);
		
		for(int i=companiesList.size()-1;i>=0;i--)
		{
			System.out.println(companiesList.get(i));
		}
	}

}
