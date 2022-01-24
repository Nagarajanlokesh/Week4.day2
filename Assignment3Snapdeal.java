package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3Snapdeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications"); 
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		1) Go to https://www.nykaa.com/
		driver.get("https://www.snapdeal.com/");
		
		driver.manage().window().maximize();
		
		Actions builder = new Actions(driver);
		//2. Go to Mens Fashion

		WebElement Mensfashion = driver.findElement(By.className("navlink"));
		builder.moveToElement(Mensfashion).perform();
		
		
		Thread.sleep(3000);
		//3. Go to Sports Shoes

		WebElement sportshoes = driver.findElement(By.xpath("//span[text()='Sports Shoes']"));
		builder.moveToElement(Mensfashion).click(sportshoes).perform();
		//4. Get the count of the sports shoes
		String showcount = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
		System.out.println(showcount);
		
		//5. Click Training shoes
		
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
        //6. Sort by Low to High

		driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
		
		driver.findElement(By.xpath("//ul[@class='sort-value']/li[2]")).click();
		
		//7. Check if the items displayed are sorted correctly

		
		String Showsortverification = driver.findElement(By.className("sort-selected")).getText();
		
		if (Showsortverification.contains("Price Low To High")) {
			
			System.out.println("Verified");
			
		}else {
			System.out.println("Displayed Incorrectly");
		}
		//8.Select the price range (900-1200)
		
		Thread.sleep(4000);
		
		WebElement fromvalue = driver.findElement(By.xpath("//input[@name='fromVal']"));
		fromvalue.clear();
		fromvalue.sendKeys("900");
		WebElement toVal = driver.findElement(By.xpath("//input[@name='toVal']"));
		toVal.clear();
		toVal.sendKeys("1200");
		driver.findElement(By.xpath("//div[contains(text(),'GO')]")).click();
		
		//9.Filter with color Navy 
		Thread.sleep(9000);
		driver.findElement(By.xpath("//label[@for='Color_s-Navy']")).click();
		

		//10 verify the all applied filters 
		
		   String text1 = driver.findElement(By.xpath("//div[contains(text(),'Price: ')]")).getText();
		
		//Thread.sleep(3000);
		//String Titlepricerange = Titleofprice.getText();
		
		if (text1.contains("Rs. 900 - Rs. 1200")) {
			
			System.out.println("Price values are in range ");
			
		}else {
			System.out.println("Not in range ");
		}
		
		WebElement colouttitle = driver.findElement(By.xpath("//div[contains(text(),'Color: ')]"));
		String coloutitlenavy = colouttitle.getText();
		
if (coloutitlenavy.contains("Navy")) {
			
			System.out.println("colour filter applied ");
			
		}else {
			System.out.println("Not applied ");


	}
//11. Mouse Hover on first resulting Training shoes

WebElement mouseover1st = driver.findElement(By.xpath("//picture[@class='picture-elem']/img"));
builder.moveToElement(mouseover1st).perform();

//12. click QuickView button

driver.findElement(By.xpath("//div[contains(text(),'Quick View')]")).click();
//13. Print the cost and the discount percentage

//String FirststwindowHandle = driver.getWindowHandle();
//Set<String> secondndwindowHandles = driver.getWindowHandles();
//
//ArrayList<String> settolist = new ArrayList<String>(secondndwindowHandles);
//
//for (String count : settolist) {
//	
//	System.out.println(count);
//	
//}
//String final2nd = settolist.get(1);
//
//driver.switchTo().window(final2nd);

String priceofshow = driver.findElement(By.xpath("//span[@class=\"payBlkBig\"]")).getText();
System.out.println("The Show Price is " + priceofshow);

String discount = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
System.out.println("The discount percentage is " + discount);
Thread.sleep(5000);

//14. Take the snapshot of the shoes.
File laststepss = driver.getScreenshotAs(OutputType.FILE);
File fil = new File("./images/sanapdeal.png");
FileUtils.copyFile(laststepss, fil);

//15. Close the current window
Thread.sleep(5000);

driver.close();



	}
	
	
	


}
