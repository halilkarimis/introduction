package introduction;

import org.openqa.selenium.By;import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","c://users//halil//downloads//00programs//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.amazon.com");
		
		driver.manage().window().maximize();   //Maximize the window
		
		Actions a = new Actions(driver);   //Create action method
		
		WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));  //Assign locater to variable
		
		a.moveToElement(move).build().perform(); //Move mouseOver
		Thread.sleep(1000); 
		WebElement srcbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

		a.moveToElement(srcbox).click().sendKeys(Keys.SHIFT, "hello").doubleClick().build().perform(); //Send HELLO and select
		Thread.sleep(1000);
		a.moveToElement(move).contextClick().build().perform();  //Right click on button
		

	}

}
