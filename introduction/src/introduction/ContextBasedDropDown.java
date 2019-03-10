package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContextBasedDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\halil\\Downloads\\00Programs\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http:\\www.makemytrip.com");
		
		driver.findElement(By.id("hp-widget__sfrom")).clear();
		
		WebElement source=driver.findElement(By.xpath("//input[@id='hp-widget__sfrom']")); //assign address to variable
		
		source.sendKeys("MUM");
		Thread.sleep(1000);
		source.sendKeys(Keys.ENTER);
		
	WebElement destination= driver.findElement(By.id("hp-widget__sTo"));
	destination.clear();
	destination.sendKeys("DEL");
	Thread.sleep(2000);
	for(int x=1; x<4; x++) {
	destination.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(500);
	}
	Thread.sleep(1000);
	destination.sendKeys(Keys.ENTER);
			
	}

}
