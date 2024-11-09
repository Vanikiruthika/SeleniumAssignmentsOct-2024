package marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TataCliq {
	public static void main(String[] args) throws InterruptedException, IOException {
		EdgeOptions opt= new EdgeOptions();
		opt.addArguments("--disable-notifications");
		// Launch the browser
	    EdgeDriver driver = new EdgeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		//1. Load the url as https://www.tatacliq.com/
		driver.get("https://www.tatacliq.com/");
		Thread.sleep(3000);
		driver.navigate().refresh();
		Actions act = new Actions(driver);
		
		//2. MouseHover on 'Brands'
		WebElement brands = driver.findElement(By.xpath("//div[text()='Brands']"));
		act.moveToElement(brands).perform();
		
		//3. MouseHover on 'Watches & Accessories'
		WebElement watch = driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
		act.moveToElement(watch).perform();
		
		//4. Choose the first option from the 'Featured brands'.
		WebElement firstElement = driver.findElement(By.xpath("//div[@class='DesktopHeader__brandsDetails']"));
		act.click(firstElement).perform();
		
		//5. Select sortby: New Arrivals
		WebElement selectElement = driver.findElement(By.xpath("//select[@class='SelectBoxDesktop__hideSelect']"));
		Select sel = new Select(selectElement);
		sel.selectByVisibleText("New Arrivals");
		
		//6. choose men from catagories filter.
		WebElement men = driver.findElement(By.xpath("(//div[text()='Men'])[1]"));
		act.click(men).perform();
		
		//7. print all price of watches
		//List<WebElement> priceListElement = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']"));
		Thread.sleep(5000);
		List<WebElement> priceListElement = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']"));
		List<String> priceList = new ArrayList<String>();
		String FirstPrice = driver.findElement(By.xpath("//div[@class='ProductDescription__priceHolder']")).getText();
		System.out.println("First product price is : " + FirstPrice);
		System.out.println("Price of all watches in the first page");
		for(int i=0;i<priceListElement.size();i++)
		{
			String price = priceListElement.get(i).getText();
			priceList.add(price);
		}
		
		System.out.println(priceList);
		//8. click on the first resulting watch
		WebElement firtWatchClick = driver.findElement(By.xpath("(//div[@class='ProductModule__base'])[1]"));
		act.click(firtWatchClick).perform();
		
		//9. click Add to Bag   and  get count from the Bag cart icon.
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowsList = new ArrayList<String>();
		windowsList.addAll(windowHandles);
		driver.switchTo().window(windowsList.get(1));
		driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
		WebElement cartBag = driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']"));
		String cartCount = cartBag.getText();
		System.out.println("Items added in cart : " + cartCount);
		
		//10. compare two price are similar
		String cartPricewhole = driver.findElement(By.xpath("//div[@class='ProductDetailsMainCard__price']//h3")).getText();
		String[] split = cartPricewhole.split(" ");
		String cartPrice = split[1];
		if (FirstPrice.equals(cartPrice))
		{
			System.out.println("Two prices are similar and Bag Total : " + cartPrice);
		}
		else {
			System.out.println("Prices are different : first price = " + FirstPrice + " and Bag Total = " + cartPrice);
		}
		//11. Click on the Bag cart icon
		
		act.click(cartBag);
		//12. Take a snap of the resulting page.
		TakesScreenshot scrshot = (TakesScreenshot)driver;
		File src = scrshot.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/tata01.png");
		FileUtils.copyFile(src, dest);
		
		//13. Close All the opened windows one by one.
		driver.close();
		driver.switchTo().window(windowsList.get(0));
		driver.close();
		
	}

}
