package week1.day3;

public class EdgeBrowser {

	public static void main(String[] args) {
		Browser bObj =new Browser();
		String launchBrowser = bObj.launchBrowser("Edge");
		System.out.println("Browser name : " + launchBrowser);
		bObj.loadUrl();
	}
}
