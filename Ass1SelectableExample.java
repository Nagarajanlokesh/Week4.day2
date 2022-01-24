package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ass1SelectableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://jqueryui.com/selectable/");
		
		Actions builder = new Actions(driver);
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		WebElement Item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
	    WebElement Item2 = driver.findElement(By.xpath("//li[text()='Item 2']"));
        WebElement Item3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
	    WebElement Item4 = driver.findElement(By.xpath("//li[text()='Item 4']"));
	//WebElement Item7 = driver.findElement(By.xpath("//li[text()='Item 7']"));
	    
	    // keydown - will press the any button in keyboard
	    //keys.contol - this is like control button 
	    //keysup - will relive the button 
//		
		builder.keyDown(Keys.CONTROL).click(Item1)
	.click(Item2).click(Item3).click(Item4).keyUp(Keys.CONTROL).perform();
		
	//	If i want to drag all the options then i use drag and drop 
//builder.dragAndDrop(Item1, Item7).perform();
	
	
		
		

	}

}
