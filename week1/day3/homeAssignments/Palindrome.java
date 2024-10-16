package week1.day3.homeAssignments;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//initialize variables
		int input=123321, output = 0,reminder;
		
		
		/*Logic for palindrome - reverse of number should be same as input
		 * Implement a 'for' loop 
		 * where the control variable ‘i’ starts with the value of the ‘input’ variable, 
		 * continues as long as ‘i’ is greater than 0, 
		 * and update ‘i’ by dividing it by 10 in each iteration.
		 * calculate the remainder by dividing the ‘input’ by 10 and assign it to variable reminder
		 * output is (output*10) + reminder
		 * after the loop, check if input and output are same
		 */
		for(int i=input;i>0;i=i/10)
		{
			reminder = i%10;
			output = (output*10) + reminder;
			
			
		}
		if(output==input)
		{
			System.out.println(input + " Number is palindrome");
		}
		else {
			System.out.println(input + " Number is not palindrome");
		}

	}

}
