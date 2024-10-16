package week1.day3.homeAssignments;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initialize an array
		int num[]={1, 4,3,2,8, 6, 7};  // 1,2,3,4,6,7,8
		//Sort the array
		Arrays.sort(num);
		
		/*Loop through the array
		 * compare num[i] with value i+1 and if didn't match print the number
		 * break from the loop
		 */
		for(int i=0; i< num.length-1;i++)
		{
			if(num[i]!=i+1)
				{
				System.out.println("Missing elements : " + (i+1));
				break;
				}
				
				
		}

	}

}
