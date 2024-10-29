package week2.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateFacebookLogin {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		/*Login to Facebook, provide username-password and click on signin
		*Click on Find your account and log in link and verify the title of the page
		*/
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Tuna@321");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.linkText("Find your account and log in.")).click();
		String title = driver.getTitle();
		System.out.println("Title of the page : " + title);
		if(title.contains("Forgotten Password"))
	
		{
			System.out.println("Now in Forgotten password page");
		}
		else
		{
			System.out.println("CLicked on some other link");
		}
	}

}
