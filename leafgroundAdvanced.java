package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class leafgroundAdvanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		Actions builder = new Actions(driver);
		
		WebElement Selenium = driver.findElement(By.xpath("//option[text()='Select your programs']/following-sibling::option[text()='Selenium']"));
		WebElement Appium = driver.findElement(By.xpath("//option[text()='Select your programs']/following-sibling::option[text()='Appium']"));
		WebElement Loadrunner = driver.findElement(By.xpath("//option[text()='Select your programs']/following-sibling::option[text()='Loadrunner']"));
		
		builder.keyDown(Keys.CONTROL).click(Selenium).click(Appium).click(Loadrunner).keyUp(Keys.CONTROL).perform();


	}

}
