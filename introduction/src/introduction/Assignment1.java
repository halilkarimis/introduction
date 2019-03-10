package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c:\\users\\halil\\downloads\\00programs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		
	  
		driver.findElement(By.id("checkBoxOption1")).click();		
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
		
		 driver.findElement(By.id("checkBoxOption1")).click();		
         Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
         
         int count = driver.findElements(By.cssSelector("input[type='checkbox']")).size();
         Assert.assertEquals(count, 3);
         
         for(int x=0; x<count;x++)
         {
        	 System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).get(x).getAttribute("value"));
         }
	}

}

