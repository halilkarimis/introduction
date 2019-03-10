package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInToAmazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\halil\\eclipse-workspace\\chromedriver.exe");
		WebDriver deneme = new ChromeDriver();
		deneme.get("https://www.amazon.com/gp/css/order-history?ie=UTF8&ref=nav_orders_first&");
		
	//	deneme.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("limon");
	//	deneme.findElement(By.cssSelector("input[value*='Go']" )).click();
		
	//	deneme.findElement(By.xpath("//span[text()='Orders']")).click();
		
		deneme.findElement(By.xpath("//input[@name='email']")).sendKeys("halil.karimis@gmail.com");
		deneme.findElement(By.cssSelector("input[name*='password']")).sendKeys("800halil19");
		//deneme.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		deneme.findElement(By.cssSelector("input[id*='signInSubmit']")).click();
		
		deneme.findElement(By.xpath("//ul[@class='a-unordered-list a-nostyle a-horizontal']/li[1]/following-sibling::li[2]")).click();

	}

}
