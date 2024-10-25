package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonShopping {
	public static void main(String[] args) throws InterruptedException {
		//Load URL
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		
		/* search for 'Bags for boys'
		 * Print the total number of results
		 * Select the first 2 brands in the left menu
		 * Choose New Arrivals (Sort)
		 * Print the first resulting bag info (name, discounted price)
		 * Get the page title and close the browser
		 */
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		String result1 = driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small']/span)[1]")).getText();
		String result2 = driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']")).getText();
		System.out.println("Result : " + result1 + " " + result2);
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[2]")).click();
	
		driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		String details = driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]")).getText();
		System.out.println("Bag details " + details);
		
		String price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		System.out.println("Price : Rs."+price);
		String title = driver.getTitle();
		System.out.println("Page title : " + title);
		if(title.contains("Amazon.in: Bags For Boys"))
		{
			System.out.println("Title matched");
		}
		else {
			{
				System.out.println("Title not matched");
			}
			driver.close();
		}
}
}
