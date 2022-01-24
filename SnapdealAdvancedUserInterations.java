package week4.day2;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapdealAdvancedUserInterations {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
	
		driver.get("https://www.snapdeal.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.manage().window().maximize();
		
		Actions builder = new Actions(driver);
		
		WebElement Mensfashion = driver.findElement(By.className("navlink"));
		builder.moveToElement(Mensfashion).perform();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Shirts']")).click();
		
		WebElement Shirt = driver.findElement(By.xpath("//div[@class='product-tuple-image ']"));
		Thread.sleep(4000);
		
		builder.moveToElement(Shirt).perform();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[@class= 'clearfix row-disc']/div")).click();
		
		
		
	}

}
