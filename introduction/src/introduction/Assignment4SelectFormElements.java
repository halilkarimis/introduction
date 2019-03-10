package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment4SelectFormElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c://users//halil//downloads//00programs//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		Integer count =driver.findElements(By.xpath("//input [@type='checkbox']")).size();
		System.out.println(count);
		 Integer selectedOption = 1;
			
		    driver.findElements(By.xpath("//input [@type='checkbox']")).get(selectedOption).click();
		    //driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).click();
		    
			String selectedText = driver.findElements(By.xpath("//input [@type='checkbox']")).get(selectedOption).getAttribute("value");
			
			
			Select dropdownSelect = new Select(driver.findElement(By.id("dropdown-class-example")));			
					dropdownSelect.selectByValue(selectedText);
		
					
		driver.findElement(By.id("name")).sendKeys(selectedText);
		// driver.findElement(By.name("enter-name")).sendKeys(selectedText);
		driver.findElement(By.id("alertbtn")).click();
					
		if(driver.switchTo().alert().getText().contains(selectedText))
		{
			System.out.println("DONE");
		}
		
		

	}

}
