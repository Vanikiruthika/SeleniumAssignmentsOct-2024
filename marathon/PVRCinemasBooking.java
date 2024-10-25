package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PVRCinemasBooking {
	public static void main(String[] args) throws InterruptedException {
		//Load URL
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.pvrcinemas.com/");
		
		//Select Location=Chennai
		driver.findElement(By.xpath("(//span[@class='cities-placed'])[2]")).click();
		driver.findElement(By.xpath("//div[@class='cities-names']/span[text()='Chennai']")).click();
		
		/* click on 'Cinema',  
		 * select a cinema, Date, Movie name, Time
		 * click on 'Book' and 'Accept'
		 */
		driver.findElement(By.xpath("//div[@class='date-show']/span[text()='Cinema']")).click();
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		driver.findElement(By.xpath("//span[text()='INOX National,Virugambakkam Chennai']")).click();
		driver.findElement(By.xpath("//span[text()='Tomorrow']")).click();
		driver.findElement(By.xpath("//div[@class='p-dropdown-items-wrapper']/ul/li/span[text()='BLACK']")).click();
		driver.findElement(By.xpath("//span[text()='04:15 PM']")).click();
		driver.findElement(By.xpath("//span[text()='Book']")).click();
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		
		/* select a seat number, Print the seat number selected, 
		 * Click on 'Proceed', 
		 * Print the Grand Total,  Click on 'Proceed'
		 * close the pop up window
		 * Get the page title and close the browser
		 */
		driver.findElement(By.xpath("//span[@id='SL.SILVER|D:8']")).click();
		String seatNumner = driver.findElement(By.xpath("//div[@class='seat-number']/p")).getText();
		System.out.println("Selected seat : "+ seatNumner);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		String grandTotal = driver.findElement(By.xpath("//div[@class='all-grand']/div/h6/span")).getText();
		System.out.println("Grand Total = " + grandTotal);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
		String title = driver.getTitle();
		System.out.println("Title of the current page : " + title);
		if(title.contains("PVR Cinemas"))
		{
			System.out.println("Title matched");
		}
		else {
			System.out.println("Title not matched");
		}
		driver.close();
	}


}
