package week4.day2;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestleafTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/table.html");
		
		
		
		
		
		int sizeofcoloum = driver.findElements(By.xpath("//table[@id='table_id']//tr[1]/th")).size();

		System.out.println(sizeofcoloum);
		
		// This will give inculding header 
		
		int sizeofrowh = driver.findElements(By.xpath("//table[@id='table_id']//tr")).size();
		System.out.println(sizeofrowh);
		
		for (int i = 2; i <=5; i++) {
			
               for (int j = 1; j <=6; j++) {
            	   
            	   String rowdetails = driver.findElement(By.xpath("//table[@id='table_id']//tr["+ i + "]/td["+ j +"]")).getText();
      			 
      			 System.out.println(rowdetails);
				
			}
			
			 
			 
			 
			
		}
		
		
			
	}

}
