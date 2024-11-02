package week3.day1.homeassignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber {
	public static void main(String[] args) {
		
		int[] arr1 = {3, 2, 11, 4, 6, 7};
		List<Integer> list1 = new ArrayList<Integer>();
		for(int i=0;i<arr1.length;i++)
		{
			list1.add(arr1[i]);
		}
		//Arrange the collection in ascending order
		Collections.sort(list1);
		int size = list1.size();
		System.out.println(size);
		//Pick the 2nd element from the last and print it.
		System.out.println("Second Lagest number : " + list1.get(size-2));
	}

}
