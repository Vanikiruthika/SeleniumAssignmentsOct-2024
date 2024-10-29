package week2.day6.homeassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/radio.xhtml");
		
		//Select 'Your most favourite browser' from the radio buttons
		driver.findElement(By.xpath("((//label[text()='Chrome'])[1])/preceding-sibling::div")).click();
		
		//Click on a radio button, then click on the same radio button again to verify that it becomes ‘unselected’.
		
	}

}
