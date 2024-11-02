package week3.day1.homeassignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindIntersection {
	public static void main(String[] args) {
		int[] arr1 = {3, 2, 11, 4, 6, 7};
		int[] arr2 = {1, 2, 8, 4, 9, 7};
		
		//Add array elements to a list
		List<Integer> list1 = new ArrayList<Integer>();
		for(int i=0;i<arr1.length;i++)
		{
			list1.add(arr1[i]);
		}
		List<Integer> list2 = new ArrayList<Integer>();
		for(int i=0;i<arr1.length;i++)
		{
			list2.add(arr2[i]);
		}
		
		Collections.sort(list1);
		Collections.sort(list2);
		//Print the values if they are equal
		for(int i=0; i<list1.size();i++)
		{
			for(int j=0;j<list2.size();j++)
			{
				if(list1.get(i).equals(list2.get(j)))
				{
					System.out.println(list1.get(i));
				}
			}
		}
	}

}
