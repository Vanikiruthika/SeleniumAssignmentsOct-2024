package week2.day5.homeassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountSelectClass {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		
		String accountName ="TestUser02";
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		
		driver.findElement(By.id("accountName")).sendKeys(accountName);
		
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		WebElement industry = driver.findElement(By.name("industryEnumId"));
		Select selIndustry = new Select(industry);
		selIndustry.selectByVisibleText("Computer Software");
		
		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		Select selOwner = new Select(ownership);
		selOwner.selectByVisibleText("S-Corporation");
		
		WebElement source = driver.findElement(By.id("dataSourceId"));
		Select selSource = new Select(source);
		selSource.selectByValue("LEAD_EMPLOYEE");
		
		WebElement campaign = driver.findElement(By.id("marketingCampaignId"));
		Select selCampaign = new Select(campaign);
		selCampaign.selectByIndex(6);
		
		WebElement state = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select selState = new Select(state);
		selState.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		WebElement element = driver.findElement(By.xpath("//span[contains(text(),'TestUser02')]"));
		
		if(element.getText().contains(accountName)) {
			System.out.println("Account name " + accountName + " is displayed correctly");
		}
		else
		{
			System.out.println("incorrect account details : " + element.getText());
		}
	}


}
