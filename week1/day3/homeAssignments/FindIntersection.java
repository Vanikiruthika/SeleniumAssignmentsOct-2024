package week1.day3.homeAssignments;

public class FindIntersection {
	public static void main(String[] args) {
		
		//Declare and initialize variables
		int a[] = {3,2,11,4,6,7};
		int b[] = {1,2,8,4,9,7};
		
				
		//Compare 2 arrays and print matching values
		
		for(int i=0; i< a.length; i++)
		{
			for(int j=0; j< b.length; j++)
			{
				if( a[i]==b[j])
				{
					System.out.println(a[i]);
				}
			}
		}
		
	}

}
