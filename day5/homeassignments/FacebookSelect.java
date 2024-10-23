package week2.day5.homeassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSelect {
	public static void main(String[] args) {
		
		/*Initialize ChromeDriver
		 * Load Facebook URL , maximize the browser 
		 */
		//ChromeDriver driver = new ChromeDriver();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		/*create new account 
		 * Provide frist name, last name, email-id, password, update date of birth and gender
		 */
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("newname");
		driver.findElement(By.name("lastname")).sendKeys("lastname");
		driver.findElement(By.name("reg_email__")).sendKeys("vanitest123@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("test123");
		
		
		WebElement elementDate = driver.findElement(By.id("day"));
		Select selDate= new Select(elementDate);
		selDate.selectByIndex(18);
		
		WebElement elementMonth = driver.findElement(By.name("birthday_month"));
		Select selMonth = new Select(elementMonth);
		selMonth.selectByValue("1");
		
		WebElement elementYear = driver.findElement(By.id("year"));
		Select selYear = new Select(elementYear);
		selYear.selectByVisibleText("1989");
		
		driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();
	}

}
