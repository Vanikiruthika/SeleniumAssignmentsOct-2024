package week2.day6.homeassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("Elsevier");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Vani");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("DVK");
		driver.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("Kiruthika");
		driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("Data");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("test123@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9988776655");
		
		WebElement state = driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
		Select selState = new Select(state);
		selState.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
		driver.findElement(By.xpath("//textarea[@name='importantNote']")).sendKeys("This is selenium");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		
		
		
		
	}

}
