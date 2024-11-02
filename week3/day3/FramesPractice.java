package week3.day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesPractice {
	
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
	
		Alert alert = driver.switchTo().alert();
		alert.accept();
		String result = driver.findElement(By.id("demo")).getText();
		System.out.println(result);
		if(result.contains("You pressed OK!"))
		{
			System.out.println("Successfully verified the text");
		}
		else {
			System.out.println("Text is not verified");
		}
		
	}
	
	

}
