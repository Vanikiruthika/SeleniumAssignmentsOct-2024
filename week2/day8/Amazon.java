package week2.day8;

public class Amazon extends CanaraBank implements Payments{

	@Override
	public void cardPayments() {
		System.out.println("Card payment --> Amazon");
		
	}

	@Override
	public void internetBanking() {
		System.out.println("Internet banking --> Amazon");
		
	}
	public void amazonOffer()
	{
		System.out.println("Offers for festivals --> Amazon");
	}
	public static void main(String[] args) {
		System.out.println("Obj created with reference to Anazon class");
		Amazon aob =  new Amazon();
		aob.amazonOffer(); //Amazon
		aob.cardPayments(); // Amazon
		aob.internetBanking(); //Amazon
		aob.cashOnDelivery(); //Payments
		aob.upiPayments(); //Payments
		aob.recordPaymentDetails(); //Canarabank
		System.out.println("Obj created with reference to Canara bank class");
		CanaraBank cobj = new Amazon();
		cobj.cardPayments();
		cobj.cashOnDelivery();
		cobj.upiPayments();
		cobj.internetBanking();
		cobj.recordPaymentDetails();
		//amazonOffer() not allowed as it is reference to Canarabank
		
		
	}
		
		
	}
	


