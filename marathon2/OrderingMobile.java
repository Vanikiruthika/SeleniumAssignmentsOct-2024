package marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.sukgu.Shadow;

public class OrderingMobile {
	public static void main(String[] args) throws IOException {
		
	
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//1. Launch ServiceNow application
	driver.get("https://dev186929.service-now.com/");
	
	//2. Login with valid credentials username as admin and password 
	driver.findElement(By.id("user_name")).sendKeys("admin");
	driver.findElement(By.id("user_password")).sendKeys("2AqjN!lC2!Vy");
	driver.findElement(By.id("sysverb_login")).click();
	
	
	//3. Click----->All in the SERVICE NOW Page  &  click the  Service catalog in filter navigator.
	Shadow sd = new Shadow(driver);
	sd.setImplicitWait(5);
	sd.findElementByXPath("//div[text()='All']").click();
	
	sd.setImplicitWait(5);
	sd.findElementByXPath("//span[text()='Service Catalog']").click();
	
	//4. Click on  mobiles both sd and driver works
	WebElement frame = sd.findElementByXPath("//iframe[@id='gsft_main']");
	driver.switchTo().frame(frame);
	//driver.findElement(By.xpath("//h2[contains(text(),'Mobiles')]")).click();
	sd.findElementByXPath("//h2[contains(text(),'Mobiles')]").click();
	
	//5. Select Apple iphone13pro both sd and driver works
	//sd.findElementByXPath("//h2[text()='Apple iPhone 13 pro']").click();
	driver.findElement(By.xpath("//strong[text()='Apple iPhone 13 pro']")).click();
	
	//6. Choose yes option in lost or broken iPhone, enter the mobile number
	driver.findElement(By.xpath("//input[@value='yes']/following::label[text()='Yes']")).click();
	driver.findElement(By.xpath("//input[@class='cat_item_option sc-content-pad form-control']")).sendKeys("90923444423");
	
	//7. Select Unlimited from the dropdown in Monthly data allowance
	WebElement select = driver.findElement(By.xpath("//select[@class='form-control cat_item_option ']"));
	Select sel = new Select(select);
	sel.selectByValue("unlimited");
	
	//8. Update color field to SierraBlue and storage field to 512GB
	driver.findElement(By.xpath("//input[@value='sierra_blue']/following::label[text()='Sierra Blue']")).click();
	driver.findElement(By.xpath("//input[@value='512']/following::label[@class='radio-label']")).click();

	//9. Click on Order now option
	driver.findElement(By.id("oi_order_now_button")).click();
	
	//10. Verify order is placed and copy the request number
	String message = driver.findElement(By.xpath("//div[@class='notification notification-success']/span[2]")).getText();
	String requestNumber = driver.findElement(By.id("requesturl")).getText();
	if(message.equals("Thank you, your request has been submitted"))
		System.out.println("Order is placed successfully and your request numbser is : " + requestNumber);
	else
		System.out.println("Order is not placed successfully");
	
	//11.Take a Snapshot of order placed page
	TakesScreenshot scrshot = (TakesScreenshot)driver;
	File source = scrshot.getScreenshotAs(OutputType.FILE);
	File dest = new File("./snaps/orderMobiles.png");
	FileUtils.copyFile(source, dest);
	
}
}
