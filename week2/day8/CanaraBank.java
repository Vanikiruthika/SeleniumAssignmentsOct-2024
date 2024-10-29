package week2.day8;

public abstract class CanaraBank implements Payments {
	public void recordPaymentDetails() {
		System.out.println("Payment details are recorded --> Canara bank");

	}
	@Override
	public void cashOnDelivery() {
		System.out.println("This is COD --> Canara Bank");
		
	}
	@Override
	public void upiPayments() {
		System.out.println("This is UPI --> Canara bank");
		
	}
	
	

}
