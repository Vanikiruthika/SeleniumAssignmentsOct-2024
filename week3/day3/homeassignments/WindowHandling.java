package week3.day3.homeassignments;

import java.time.Duration;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/login");
		//Enter the username and password and click on Login and click on CRM?SFA link
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Click on the Contacts button and next Merge Contacts
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();
		//Click on the widget of the "From Contact".
		driver.findElement(By.xpath("//input[@id='partyIdFrom']/following-sibling::a")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowsList = new LinkedList<String>();
		windowsList.addAll(windowHandles);
		driver.switchTo().window(windowsList.get(1));
		
		//Click on the first resulting contact
		driver.findElement(By.xpath("((//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first '])[1])//a")).click();
		driver.switchTo().window(windowsList.get(0));
		
		////Click on the widget of the "To Contact"
		driver.findElement(By.xpath("//input[@id='partyIdTo']/following-sibling::a")).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> windowsList2 = new LinkedList<String>();
		windowsList2.addAll(windowHandles2);
		//Click on the second resulting contact
		driver.switchTo().window(windowsList2.get(1));
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]/a")).click();
		driver.switchTo().window(windowsList2.get(0));
		//Click on the Merge button
		driver.findElement(By.linkText("Merge")).click();
		
		//Accept the alert
		Alert alert = driver.switchTo().alert();
		alert.accept();
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contains("Merge Contacts | opentaps CRM"))
		{
			System.out.println(title+" Title verified successfully");
		}
		else {
			System.out.println(title + " Title is not verified");
		}
		
		
	}

}
