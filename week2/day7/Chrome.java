package week2.day7;

public class Chrome extends Browser {
	
	public void openIncognito() {
		System.out.println("open incognito --> Chrome");

	}
	public void clearCache() {
		System.out.println("clear cache --> Chrome");

	}
	public static void main(String[] args) {
		Chrome cobj = new Chrome();
		
		cobj.openIncognito();
		cobj.clearCache();
		cobj.openURL();
		cobj.closeBrowser();
		cobj.navigateBack();
		cobj.browserName="Chrome";
		cobj.browserVersion = 50.4f;
		
		System.out.println("Broser name : " + cobj.browserName +" and version : " +cobj.browserVersion);
	}

}
