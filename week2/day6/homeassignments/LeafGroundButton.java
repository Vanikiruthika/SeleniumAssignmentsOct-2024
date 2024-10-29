package week2.day6.homeassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.cienvironment.internal.com.eclipsesource.json.Location;

public class LeafGroundButton {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/button.xhtml");
		
		//Click on the button with the text ‘Click and Confirm title.’
		driver.findElement(By.xpath("//span[text()='Click']/parent::button")).click();
		//Verify that the title of the page is ‘dashboard.’
		String titleButton = driver.getTitle();
		if(titleButton.equals("Dashboard"))
		{
			System.out.println("Button clicked and Dashboard page is opened");
		}
		else {
			System.out.println("Button not clicked successfully");
		}
		driver.navigate().back();
		
		//Check if the button with the text ‘Confirm if the button is disabled’ is disabled.
		WebElement disabledButton = driver.findElement(By.xpath("//span[text()='Disabled']/parent::button"));
		boolean buttonStatus = disabledButton.isEnabled();
		if(buttonStatus)
		{
			System.out.println("the button with the text ‘Confirm if the button is disabled’ is enabled");
		}
		else {
			System.out.println("the button with the text ‘Confirm if the button is disabled’ is disabled");
		}
		//Find and print the position of the button with the text ‘Submit.’
		Point location = driver.findElement(By.xpath("(//span[text()='Submit']/parent::button)[1]")).getLocation();
		System.out.println("Position of button = x="+location.getX() + " y=" +location.getY());
		
		//Find and print the background color of the button with the text ‘Find the Save button color.’
		String colour = driver.findElement(By.xpath("//span[text()='Save']/parent::button")).getCssValue("background-color");
		System.out.println("Background colour : " + colour);
		
		//Find and print the height and width of the button with the text ‘Find the height and width of this button.’
		WebElement hwbutton = driver.findElement(By.xpath("(//span[text()='Submit']/parent::button)[2]"));
		Dimension size = hwbutton.getSize();
		int height = size.height;
		int width = size.width;
		System.out.println("Height :"+ height +" " + "width :" +width);
		driver.close();
		
	}

}
