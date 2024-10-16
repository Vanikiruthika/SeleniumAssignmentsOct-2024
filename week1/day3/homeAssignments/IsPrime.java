package week1.day3.homeAssignments;

public class IsPrime {

	public static void main(String[] args) {
		
		int n =3;
		boolean prime=true;
		if(n==0 || n==1)
		{			
			prime=false;
		}
		
		for(int i=2; i <= n-1; i++)
		{
			if(n%i == 0)
			{				
				prime=false;
				break;
			}
			
		}
		if(prime==true)
			System.out.println(n + " is a prime number");
		else
			System.out.println(n + " is not a prime number");

	}

}
