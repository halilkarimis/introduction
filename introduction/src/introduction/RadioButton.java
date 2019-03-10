package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\halil\\Downloads\\00Programs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
		int count = driver.findElements(By.xpath("//input[@name='group1']")).size();
		
		for(int x =0; x<count; x++) {
			
		String text= driver.findElements(By.xpath("//input[@name='group1']")).get(x).getAttribute("value");
		
		if( text.equals("Cheese"))
		{
			driver.findElements(By.xpath("//input[@name='group1']")).get(x).click();
			
		System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).get(x).getAttribute("value"));
				
		}
		}
		
		//driver.findElement(By.xpath("//input[@value='Cheese']")).click();
		//System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).size());
		

	}

}
