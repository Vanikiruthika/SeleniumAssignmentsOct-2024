package week1.day3;

import java.util.Arrays;

public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[] = {2,5,3,4,4,3,4,2,3};
		System.out.println();
		Arrays.sort(num);
		for(int i=0; i < num.length -1 ;i++)
		{
			if(num[i] == num[i+1])
			{
				System.out.println("print the duplicates : " + num[i]);
			}
		}
	}

}
