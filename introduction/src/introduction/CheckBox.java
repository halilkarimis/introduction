package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\halil\\Downloads\\00Programs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.spicejet.com");
		
		
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected();
		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected()); //if false
		
		driver.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_friendsandfamily']")).click();
		
        Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected()); //if true
		
		
		int count=driver.findElements(By.cssSelector("input[type='checkbox']")).size();
		
		Assert.assertEquals(count, 6);  //if equals
		
		for(int x=0;x<count;x++) {
			
			System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).get(x));
		
		
		}
		
		
		

	}


}