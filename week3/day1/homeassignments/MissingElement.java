package week3.day1.homeassignments;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElement {
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 10, 6, 8};
		
		List<Integer> list = new ArrayList<Integer>();
		//Arrange the collection in ascending order
		for(int i=0;i<arr1.length; i++)
		{
			list.add(arr1[i]);
		}
		Collections.sort(list);
		System.out.println(list);
		int fnum = list.get(0);
		int lnum = list.get(list.size()-1);
		System.out.println(fnum + " " + lnum);
		
		//Inside the loop, check the current element + 1 is not equal to the next element. 
		//This comparison checks if there is a gap in the sequence of numbers
		for (int i = fnum; i < lnum; i++) {

			int current = list.get(i-1);  // 1 2
			if(i == lnum)
			{
				break;
			}
			else
			{
			int next = list.get(i); //2 3
			//j = 2
			
			// If there is a gap, print missing numbers
			for (int j = current + 1; j < next; j++) {
				System.out.print(j + " ");
			}
			}
			
		
		
		
	}

	}}
