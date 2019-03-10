package introduction;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverScopeAndOpeningTabsGetTitle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c://users//halil//downloads//00programs//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");

		System.out.println(driver.findElements(By.tagName("a")).size());

		WebElement footerDriver = driver.findElement(By.id("gf-BIG")); // limiting webdriver scope

		System.out.println((footerDriver.findElements(By.tagName("a"))).size());

		WebElement fantazi = driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[2]"));
		System.out.println((fantazi.findElements(By.tagName("a"))).size());

		WebElement footerFirstColumnDriver = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println((footerFirstColumnDriver.findElements(By.tagName("a"))).size());

		Integer count = footerFirstColumnDriver.findElements(By.tagName("a")).size();

		String clickNextLink = Keys.chord(Keys.CONTROL, Keys.ENTER); // Click next link

		for (int x = 1; x < count; x++) {

			footerFirstColumnDriver.findElements(By.tagName("a")).get(x).sendKeys(clickNextLink);
			Thread.sleep(5000);
		}
		Set<String> tabNameList = driver.getWindowHandles();
		Iterator<String> nextTabTitle = tabNameList.iterator();
		nextTabTitle.next();                                            //to skip main page title
		while (nextTabTitle.hasNext()) {

			driver.switchTo().window(nextTabTitle.next());

			System.out.println(driver.getTitle());

		}
	}
}
