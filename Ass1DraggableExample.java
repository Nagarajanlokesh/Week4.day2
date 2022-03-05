package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ass1DraggableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("http://jqueryui.com/draggable/");
		
		Actions builder = new Actions(driver);
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		WebElement Draggable = driver.findElement(By.id("draggable"));
		//dragAndDropBy(WebElement, x, y)This will be used in both situations - If we know or don't know the taget location 
		builder.dragAndDropBy(Draggable, 100, 50).perform();
		

	}

}
