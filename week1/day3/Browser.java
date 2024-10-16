package week1.day3;

public class Browser {
	public String launchBrowser(String browserName)
	{
		System.out.println("Browser lauched successfluuy");
		return browserName;
	}
	public void loadUrl()
	{
		System.out.println("Application url loaded successfully");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Browser browserObj = new Browser();
		String launchBrowser = browserObj.launchBrowser("Chrome");
		System.out.println("Browser name : " + launchBrowser);
		browserObj.loadUrl();

	}

}
