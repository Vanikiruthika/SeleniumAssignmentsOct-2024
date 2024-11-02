package week3.day1.homeassignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListAjio {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.ajio.com/");
		//In the search box, type as "bags" and press enter
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bage",Keys.ENTER);
		//To the left of the screen under "Gender" click on "Men"
		driver.findElement(By.xpath("//input[@id='Men']/parent::div/label")).click();
		//Under "Category" click "Fashion Bags"
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		//Print the count of the items found.
		Thread.sleep(5000);
		String text = driver.findElement(By.xpath("//div[@class='length']/strong")).getText();
		System.out.println("Items found count : " +text);
		
		//Get the list of brand of the products displayed in the page and print the list.
		List<WebElement> brands = driver.findElements(By.xpath("//div[@class='brand']"));
		List<String> brandsNew = new ArrayList<String>();
		
		System.out.println("********************list of brand of the products ************************");
		for(int i=0;i<brands.size();i++)
		{
			brandsNew.add(brands.get(i).getText()) ;
						
		}
			Collections.sort(brandsNew);
			System.out.println(brandsNew);
			
			
		System.out.println("********************************************************");
		
		
		//Get the list of names of the bags and print it
		System.out.println("list of names of the bags");
		
		List<WebElement> bagNames = driver.findElements(By.xpath("//div[@class='nameCls']"));
		List<String> bagNamesNew = new ArrayList<String>();
		for(int i=0;i<bagNames.size();i++)
		{
			bagNamesNew.add(bagNames.get(i).getText()) ;
						
		}
			Collections.sort(bagNamesNew);
			System.out.println(bagNamesNew);
	}

}
