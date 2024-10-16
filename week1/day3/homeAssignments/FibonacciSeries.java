package week1.day3.homeAssignments;



public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declare and initialize variable
		 int input =8;
		 int sum ,num1=0,num2=1;
		 
		 /*Logic for fibonacci series 0,1,1,2,3,5,8,13
		  * num1=0,num2=1, sum = num1 + num2 ,
		  * put num1=num2 and num2=sum
		  */
		System.out.println("Fibonacci series of " + input);
		 for(int i=1; i<=input; i++)
		 {
			 System.out.print(num1 + " ");
			 sum =  num1 + num2;
			 num1=num2;
			 num2=sum;
			 
			 
		 }

	}

}
