package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailTables {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://erail.in/");
		
		WebElement from = driver.findElement(By.id("txtStationFrom"));
		from.clear();
		from.sendKeys("MS");
		//Thread.sleep(1000);
		from.sendKeys(Keys.ENTER);
		
		WebElement To = driver.findElement(By.id("txtStationTo"));
		To.clear();
		To.sendKeys("Mdu");
		Thread.sleep(1000);
		To.sendKeys(Keys.ENTER);
		
		
		// To uncheck also we need to click so same process to click and un click 
		
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
		int sizeoftains = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr")).size();
		
		System.out.println("The Total Train available is " + sizeoftains);
		
		//Thread.sleep(4000);
		
		ArrayList<String> Trainduplicates = new ArrayList<String>();
		
		for (int i = 1; i <=sizeoftains; i++) {
			
			String Trainnames = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr["+ i +"]/td[2]")).getText();
			System.out.println(Trainnames);
			
			Trainduplicates.add(Trainnames);
			
			
		}
		
		Set<String> Trainduplicateset = new HashSet<String>(Trainduplicates);
		
		if (Trainduplicates.size() == Trainduplicateset.size() ){
			
			System.out.println("No duplicate");
			
		}else {
			System.out.println("Duplicate");
			
	
		}
;
		
		

	}

}
