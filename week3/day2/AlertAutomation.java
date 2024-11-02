package week3.day2;

import java.time.Duration;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAutomation {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Vani");
		//alert.accept();
		alert.dismiss();
		String text = driver.findElement(By.id("confirm_result")).getText();
		System.out.println(text);
	}

}
