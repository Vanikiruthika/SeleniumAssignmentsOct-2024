package week3.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MobileLinks {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles",Keys.ENTER);
		Thread.sleep(3000);
		List<WebElement> priceList = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		int size = priceList.size();
		System.out.println("Size of the list " + size);
		
		List<Integer> list = new ArrayList<Integer>();
		for(WebElement e : priceList) {
			String text = e.getText();
			String newtext = text.replace(",", "");
			int number = Integer.parseInt(newtext);
			list.add(number);
			Collections.sort(list);
		}
		
		
		System.out.println(list);
	}

}
