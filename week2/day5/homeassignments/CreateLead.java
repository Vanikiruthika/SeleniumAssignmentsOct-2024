package week2.day5.homeassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vani");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Dhandapani");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Sr Quality test Engineer");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9911882277");
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println("Title of the page: " + title);
		if(title.contains("View Lead"))
		{
			System.out.println("Web page title is verified");
		}
		else
		{
			System.out.println("Web page title is not verified");
		}
		
	}

}
