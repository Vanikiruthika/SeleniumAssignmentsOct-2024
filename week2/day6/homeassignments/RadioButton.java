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
		driver.findElement(By.xpath("//input[@value='Hyderabad']/parent::div/following-sibling::div")).click();
		boolean selected1 = driver.findElement(By.xpath("//input[@value='Hyderabad']")).isSelected();
		if(selected1)
			{
			System.out.println("Selected status : " + selected1 + " and Radio button is selected");
			}
		else
		{
			System.out.println("Selected status : " + selected1 + " and Radio button is not selected");
		}
		driver.findElement(By.xpath("//input[@value='Hyderabad']/parent::div/following-sibling::div")).click();
		boolean selected2 = driver.findElement(By.xpath("//input[@value='Hyderabad']")).isSelected();
		
		if(selected2)
		{
		System.out.println("Selected status : " + selected2 + " and Radio button is selected");
		}
		else
		{
			System.out.println("Selected status : " + selected2 + " and Radio button is not selected");
		}
		
		//Identify the radio button that is initially selected by default.
		
		String defaultButton = driver.findElement(By.xpath("(((//h5[text()='Find the default select radio button']/parent::div)//input[@checked='checked'])/ancestor::div[@class='ui-radiobutton ui-widget'])/following-sibling::label")).getText();
		System.out.println("Default selected radio button : "+ defaultButton);
		
		//Check and select the age group (21-40 Years) if not already selected.
		
		boolean checkedStatus = driver.findElement(By.xpath("//input[@value='21-40 Years']")).isSelected();
		
		if(checkedStatus)
		{
			System.out.println("Age group 21-40 Years is selected already");
		}
		else {
			driver.findElement(By.xpath("(//input[@value='21-40 Years']/parent::div)/following-sibling::div")).click();
			System.out.println("Age group 21-40 Years is selected now");
		
		}
		
	}

}
