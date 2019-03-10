package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IAmNotRobotFrames2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "c://users//halil//downloads//00programs//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.finalwebsites.com/demos/custom-captcha-image-script");
		
		
		int frameNumber = getFrameNumber(driver,By.xpath("//span[@id='recaptcha-anchor']/div[5]"));
		driver.switchTo().frame(frameNumber);
		
		driver.findElement(By.xpath("//span[@id='recaptcha-anchor']/div[5]")).click();
		
		Thread.sleep(3000);
		
		int frameNumber2 = getFrameNumber(driver,By.xpath("//*[@id='recaptcha-verify-button']"));  // Location of second button
		driver.switchTo().frame(frameNumber2);
		
		driver.findElement(By.xpath("//*[@id='recaptcha-verify-button']")).click();          //Click to second button
		
		
		

	}

	public static int getFrameNumber(WebDriver driver, By by) {
		int count = driver.findElements(By.tagName("iframe")).size();
		int mynumber = 0;
		for (int x = 0; x < count; x++) {

			driver.switchTo().frame(x);

			int number = driver.findElements(by).size();

			if (number > 0) {
				mynumber = x;
				break;
			} else {
				System.out.println("Contunue looping");
			}

		}

		driver.switchTo().defaultContent();  // Return to main webpage to check other elements or to switch to another frame
		return mynumber;
	}

}
