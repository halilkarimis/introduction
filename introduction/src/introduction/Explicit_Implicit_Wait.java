package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Implicit_Wait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "c://users//halil//downloads//00programs//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait explicitWait = new WebDriverWait(driver, 5);
		
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		
		driver.findElement(By.xpath("//a[contains(@href,'javascript:')]")).click(); // Or next one same
		   //   driver.findElement(By.cssSelector("a[href*='loadAjax']")).click();
		   //   driver.findElement(By.xpath("//a[contains(text(),'Click to load get data via Ajax!')]")).click();
		   //   driver.findElement(By.xpath("//a[contains(@href,'Ajax')]")).click();
		   /*   
		       <a href="javascript: void(0);loadAjax();">Click to load get data via Ajax!</a>
		  
		    */
		 		
		//Thread.sleep(5000);
		String resultText="Process completed! This response has been loaded via the Ajax request directly from the web server, without reoading this page.";
		explicitWait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("results"), resultText));
		
		//c.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("#results"))));
		//d.until(ExpectedConditions.textToBe(By.id("results"),"Process completed! This response has been loaded via the Ajax request directly from the web server, without reoading this page."));
		
		
		System.out.println(driver.findElement(By.id("results")).getText());
		
		

	}

}
