package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment2Cleartrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","c://users//halil//downloads//00programs//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.cleartrip.com");
		
		driver.findElement(By.id("Adults")).click();
		driver.findElement(By.id("Adults")).sendKeys(Keys.ARROW_DOWN);		
		Thread.sleep(2000);		
		driver.findElement(By.id("Childrens")).click();
		driver.findElement(By.id("Childrens")).sendKeys(Keys.ARROW_DOWN);		
		Thread.sleep(2000);
		driver.findElement(By.id("DepartDate")).click();		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("MoreOptionsLink")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("indigo");
		Thread.sleep(2000);
		driver.findElement(By.id("SearchBtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
		
		

	}

}
