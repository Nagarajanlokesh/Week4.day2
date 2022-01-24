package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4Myntra {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications"); 
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		1) Go to https://www.nykaa.com/
		driver.get("https://www.myntra.com/");
		
		driver.manage().window().maximize();
		
		Actions builder = new Actions(driver);
		//2) Mouse hover on MeN 
		WebElement mens = driver.findElement(By.xpath("//a[contains(text(),'Men')]"));
		builder.moveToElement(mens).perform();
		
		//3) Click Jackets
		
		WebElement Jackets = driver.findElement(By.xpath("//a[contains(text(),'Jackets')]"));
		Jackets.click();
		//4) Find the total count of item 
		
		String TotalJacketcount = driver.findElement(By.className("title-count")).getText();
				System.out.println(TotalJacketcount);
				
				//5) Validate the sum of categories count matches
			//)6Check jackets
				
				driver.findElement(By.xpath("//div[@class='common-checkboxIndicator']")).click();
				
				
				//7) Click + More option under BRAND
				
				driver.findElement(By.xpath("//div[@class='brand-more']")).click();
				
				//8) Type Duke and click checkbox
				
				driver.findElement(By.xpath("//input[@class='FilterDirectory-searchInput']")).sendKeys("Duke");
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//label[contains(text(),'Duke')])[2]")).click();
				
				//9) Close the pop-up x
				
				driver.findElement(By.xpath("//div[@class='FilterDirectory-titleBar']//span")).click();
				
				//10) Confirm all the Coats are of brand Duke
				//11 Sort by Better Discount
				
				driver.findElement(By.xpath("//div[@class='sort-sortBy']")).click();
				
				driver.findElement(By.xpath("//label[contains(text(),'Better Discount')]")).click();
				
				Thread.sleep(3000);
				
				//12) Find the price of first displayed item
				String price =  driver.findElement(By.xpath("//span[@class='product-discountedPrice']")).getText();
				System.out.println(price);
				
				WebElement mouseonmens = driver.findElement(By.xpath("//img[@class='img-responsive']"));
				
				builder.moveToElement(mouseonmens).perform();
				
				driver.findElement(By.xpath("//div[@class='product-actions ']")).click();

	}

}
