package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInToFacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\halil\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//System.setProperty("webdriver.ie.driver", "C:\\Users\\halil\\eclipse-workspace\\MicrosoftWebDriver.exe");
		//WebDriver idriver=new InternetExplorerDriver();
				
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\halil\\eclipse-workspace\\geckodriver.exe");
		//WebDriver fdriver=new FirefoxDriver();
							
	/*	driver.get("http://google.com");
		driver.getTitle();
		System.out.println(driver.getTitle());  */
		
		driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("forgeneralaffairs@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("@Bilgisayar123");
		driver.findElement(By.id("u_0_2")).click();
						
		//driver.navigate().back();
		//driver.close();
	}

}
