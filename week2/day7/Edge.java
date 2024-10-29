package week2.day7;

public class Edge extends Browser{
	public void takeSnap() {
		System.out.println("take snap --> Edge");

	}
	public void clearCookies() {
		System.out.println("clear cookies --> Edge");

	}
	public static void main(String[] args) {
		Edge eobj=new Edge();
		eobj.takeSnap();
		eobj.clearCookies();
		eobj.openURL();
		eobj.closeBrowser();
		eobj.navigateBack();
		eobj.browserName="Edge";
		eobj.browserVersion = 20.4f;
		
		System.out.println("Broser name : " + eobj.browserName +" and version : " +eobj.browserVersion);
		
	}

}
