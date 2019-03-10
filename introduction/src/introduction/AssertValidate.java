package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertValidate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:\\users\\halil\\downloads\\00programs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("http:\\www.spicejet.com");
        
        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@value='DEL']")).click();
        Thread.sleep(2000);       
       
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
        Thread.sleep(2000); 
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click(); //Use class as CSS
        Thread.sleep(2000);
        
        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
        {
        	
        	System.out.println("Selected");
        	Assert.assertTrue(true);
        }
        else {
        	System.out.println("Not Selected");
        	Assert.assertTrue(false);
        }
        
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);
        for(int x=1; x<5;x++) {
        	
        	driver.findElement(By.id("hrefIncAdt")).click();
        }
        
        driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
        driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
        
      
        
	}

}
