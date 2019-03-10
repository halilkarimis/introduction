package introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "c://users//halil//downloads//00programs//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.path2usa.com/travel-companions");
		driver.findElement(By.xpath("//input[@id='travel_date']")).click();

		List<WebElement> days = driver.findElements(By.className("day"));
		int totalDays = days.size();

		while (!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("April")) {
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}

		
		for (int x = 0; x < totalDays; x++) {
			String myDay = driver.findElements(By.className("day")).get(x).getText();
			if (myDay.equalsIgnoreCase("23")) {
				driver.findElements(By.className("day")).get(x).click();
				break;
			}

		}

	}

}
