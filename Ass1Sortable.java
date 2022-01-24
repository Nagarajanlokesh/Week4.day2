package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ass1Sortable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://jqueryui.com/sortable/");
		
		Actions builder = new Actions(driver);
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		WebElement Item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
	    WebElement Item2 = driver.findElement(By.xpath("//li[text()='Item 2']"));
        WebElement Item3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
	    WebElement Item4 = driver.findElement(By.xpath("//li[text()='Item 4']"));
	    
	    //builder.clickAndHold(Item1).moveToElement(Item4).release(Item1).perform();
	    builder.dragAndDrop(Item1, Item4).perform();
	    

	}

}
