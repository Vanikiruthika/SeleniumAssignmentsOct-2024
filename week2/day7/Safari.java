package week2.day7;

public class Safari extends Browser {
	public void readerMode() {
		System.out.println("reader mode --> safari");

	}
	public void fullScreenMode() {
		System.out.println("full screen mode --> safari");

	}
	public static void main(String[] args) {
		Safari sobj = new Safari();
		sobj.readerMode();
		sobj.fullScreenMode();
		sobj.openURL();
		sobj.closeBrowser();
		sobj.navigateBack();
		sobj.browserName="Safari";
		sobj.browserVersion = 35.1f;
		
		System.out.println("Broser name : " + sobj.browserName +" and version : " +sobj.browserVersion);
		
	}

}
