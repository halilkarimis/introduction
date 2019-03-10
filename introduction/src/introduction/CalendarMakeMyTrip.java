package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarMakeMyTrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub //April 23

		System.setProperty("webdriver.chrome.driver", "c://users//halil//downloads//00programs//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/flights/");
		
driver.findElement(By.xpath("//div[@id='js-switch__option']/div[2]/label")).click();

/*

driver.findElement(By.id("hp-widget__sfrom")).click();
driver.findElement(By.id("hp-widget__sfrom")).sendKeys("BKK");
Thread.sleep(2000);
driver.findElement(By.id("hp-widget__sfrom")).sendKeys(Keys.ENTER);


driver.findElement(By.id("hp-widget__sTo")).click();
driver.findElement(By.id("hp-widget__sTo")).sendKeys("DXB");
Thread.sleep(2000);
driver.findElement(By.id("hp-widget__sTo")).sendKeys(Keys.ENTER);

	Thread.sleep(2000);
		//driver.findElement(By.id("hp-widget__depart")).click();
		driver.findElement(By.xpath(".//*[@id='hp-widget__depart']")).click();

		
		        //driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-month']")).getText().contains("MARCH")		
		while (!driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']/div/div/span")).getText().equalsIgnoreCase("April")) {
			
			driver.findElement(By.cssSelector("div[class='ui-datepicker-group ui-datepicker-group-last'] span[class='ui-icon ui-icon-circle-triangle-e']")).click();
			//driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']/span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}   
		System.out.println(driver.findElement(By.cssSelector("div[class='ui-datepicker-group ui-datepicker-group-last'] span[class='ui-datepicker-month']")).getText());

		
		int count = driver.findElements(By.cssSelector("table[class='ui-datepicker-calendar'] a[class='ui-state-default']")).size();
		          //driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']/table[@class='ui-datepicker-calendar']/tbody/tr/td/a[@class='ui-state-default']")).size();
		

		for(int x=0; x<count; x=x+1)
		{
			if(driver.findElements(By.cssSelector("table[class='ui-datepicker-calendar'] a[class='ui-state-default']")).get(x).getText().equalsIgnoreCase("23"))
			{
				driver.findElements(By.cssSelector("table[class='ui-datepicker-calendar'] a[class='ui-state-default']")).get(x).click();
				break;
			}
		}  
		
		*/
		
		driver.findElement(By.id("hp-widget__return")).click();
		Thread.sleep(3000);
		//System.out.println(driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-month'][3]")).getText());
		
	
		System.out.println(driver.findElement(By.xpath("(//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-month'])[3]")).getText());

		while(!driver.findElement(By.xpath("(//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-month'])[3]")).getText().equalsIgnoreCase("AUGUST")) {
			
			//driver.findElement(By.xpath("(//a[@class='ui-datepicker-next ui-corner-all']/span[@class='ui-icon ui-icon-circle-triangle-e'])[2]")).click();
			
			driver.findElement(By.xpath("(//span[text()='Next'])[2]")).click();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
