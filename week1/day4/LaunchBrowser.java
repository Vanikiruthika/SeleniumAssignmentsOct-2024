package week1.day4;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {
	public static void main(String[] args) {
		
		//Launch the browser
		//ChromeDriver driver = new ChromeDriver();
		EdgeDriver driver = new EdgeDriver();
		
		//Load the URL
		driver.get("https://www.facebook.com/");
		
		//Maximize
		driver.manage().window().maximize();
		
		//get the title
		String title = driver.getTitle();
		System.out.println(title);
		//close the browser
		driver.close();
	}

}
