package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2Nykaa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
			
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//			1) Go to https://www.nykaa.com/
			driver.get("https://www.nykaa.com/");
			
			Actions builder = new Actions(driver);
//			2) Mouseover on Brands and Search L'Oreal Paris
			WebElement brands = driver.findElement(By.xpath("//a[text()='brands']"));
			builder.moveToElement(brands).perform();
			
			//driver.findElement(By.xpath("//img[contains(@src,'lorealparis')]")).click();
			driver.findElement(By.xpath("//span[contains(text(),'customer top rated')]//following::div]")).click();
			
			String title = driver.getTitle();
			System.out.println(title);
			if (title.contains("L'Oreal Paris")) {
				System.out.println("Title contains L'Oreal Paris");
			} else {
				System.out.println("Title does not contain L'Oreal Paris");
				

//			
			
//				4) Check the title contains L'Oreal Paris(Hint-GetTitle)
//				5) Click sort By and select customer top rated
				driver.findElement(By.className("sort-name")).click();
				
				driver.findElement(By.xpath("//span[contains(text(),'customer top rated')]//following::div")).click();
				
				
				
				
//				6) Click Category and click Hair->Click haircare->Shampoo
//				7) Click->Concern->Color Protection
//				8)check whether the Filter is applied with Shampoo
//				9) Click on L'Oreal Paris Colour Protect Shampoo
//				10) GO to the new window and select size as 175ml
//				11) Print the MRP of the product
//				12) Click on ADD to BAG
//				13) Go to Shopping Bag 
//				14) Print the Grand Total amount
//				15) Click Proceed
//				16) Click on Continue as Guest
//				17) Check if this grand total is the same in step 14
//				18) Close all windows
			
			
			
			

	}

}
}