package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IAmNotRobotFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "c://users//halil//downloads//00programs//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://socialblade.com/register");
		int count = driver.findElements(By.tagName("iframe")).size();

		for (int x = 0; x < count; x++) {

			driver.switchTo().frame(x);

			int number = driver.findElements(By.xpath("//span[@id='recaptcha-anchor']/div[5]")).size();

			if (number > 0) {
				driver.findElement(By.xpath("//span[@id='recaptcha-anchor']/div[5]")).click();
				break;
			} else {
				System.out.println("Contunue looping");
			}

		}
	}

}
