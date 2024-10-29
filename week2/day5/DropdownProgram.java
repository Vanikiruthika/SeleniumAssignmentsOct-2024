package week2.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownProgram {
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Elsevier");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vanikiruthika");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Dhandapani");
		WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sourceSel = new Select(sourceDD);
		sourceSel.selectByIndex(4);
		WebElement marketDD = driver.findElement(By.name("marketingCampaignId"));
		Select marketSel = new Select(marketDD);
		marketSel.selectByVisibleText("Automobile");
		WebElement ownerDD = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ownerSel =new Select(ownerDD);
		ownerSel.selectByValue("OWN_CCORP");
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contains("View Lead"))
		{
			System.out.println("Created a data successfully");
			
		}
		else {
			System.out.println("Check the data");
		}
	}

}
