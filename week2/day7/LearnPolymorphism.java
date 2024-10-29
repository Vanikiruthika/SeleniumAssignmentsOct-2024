package week2.day7;

public class LearnPolymorphism {

	public void reportStep(String msg, String status)
	{
		System.out.println("Inside reportstep 1");
		System.out.println("message "+ msg);
		System.out.println("status "+ status);
	}
	public void reportStep(String msg, String status, boolean snap)
	{
		System.out.println("Inside reportstep 2");
		System.out.println("message "+ msg);
		System.out.println("status "+ status);
		System.out.println("snap "+ snap);
	}
	
	public static void main(String[] args) {
		String msg1="DEV";
		String msg2="TEST";
		String status1="Development Success";
		String status2="Testing success";
		boolean snap=true;
		LearnPolymorphism learn = new LearnPolymorphism();
		learn.reportStep(msg1, status1);
		learn.reportStep(msg2, status2, snap);
	}
}
