package week2.day6.homeassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://leafground.com/checkbox.xhtml");
		
		//1. Click on the "Basic Checkbox.”
		driver.findElement(By.xpath("//span[text()='Basic']/preceding-sibling::div[contains(@class,'ui-chkbox-box ui-widget ui-corner-all')]")).click();
		
		//2. Click on the "Notification Checkbox." - Verify that the expected message is displayed.
		driver.findElement(By.xpath("//span[text()='Ajax']/preceding-sibling::div[contains(@class,'ui-chkbox-box ui-widget ui-corner-all')]")).click();
		String actualMsg = driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
		if(actualMsg.equals("Checked"))
		{
			System.out.println("Successfully verified message for Notification");
		}
		else {
			System.out.println("Message is not same " + actualMsg);
		}

		//3. Click on your favorite language (assuming it's related to checkboxes)
		driver.findElement(By.xpath("//label[text()='Java']/preceding-sibling::div[@class='ui-chkbox ui-widget']")).click();
		driver.findElement(By.xpath("//label[text()='Python']")).click();
		
		//4. Click on the "Tri-State Checkbox."Verify which tri-state option has been chosen
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']/div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
		String state = driver.findElement(By.xpath("//span[@class='ui-growl-title']/following-sibling::p")).getText();
		System.out.println("Selected one : " + state);
		
		//5.Click on the "Toggle Switch. and verify message
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		String textmessage3 = driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
		if(textmessage3.equals("Checked"))
		{
			System.out.println("Toggle switch is selected");
		}
		else {
			System.out.println("Toggle switch is not selected");
		}
		
		//6. Verify if the Checkbox is disabled.
		boolean selected = driver.findElement(By.xpath("//input[@disabled='disabled']")).isEnabled();
		if(selected)
		{
			System.out.println("Check box is enabled");
			
		}
		else {
			System.out.println("Check box is disabled");
		}
		
		//7.Select multiple options on the page
		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
		driver.findElement(By.xpath("((//label[text()='London'])[2])/preceding-sibling::div")).click();
		driver.findElement(By.xpath("((//label[text()='Rome'])[2])/preceding-sibling::div")).click();
		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
		driver.close();
		
	}
}
