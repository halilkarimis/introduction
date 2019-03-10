package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteTextboxJavascriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "c://users//halil//downloads//00programs//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ksrtc.in/oprs-web/");
		
		driver.findElement(By.id("fromPlaceName")).click();
		driver.findElement(By.id("fromPlaceName")).sendKeys("BENG");
		
		JavascriptExecutor jsextract= (JavascriptExecutor)driver;
		String text=null;
		int maxExecution=0;
		do {
			maxExecution++;
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		String script="return document.getElementById(\"fromPlaceName\").value;";		
		text = (String) jsextract.executeScript(script);
		System.out.println(text);
		
		if(maxExecution>5) {
			System.out.println("No result found");
			break;			
		}
			
		
		}while(!text.equalsIgnoreCase("BENGALURU INTERNATIONal AIPORT")); 
			
			
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ENTER);
		
		
	}

}
