package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteTextboxJavascriptExecutor2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "c://users//halil//downloads//00programs//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");

		driver.findElement(By.id("autocomplete")).click();
		driver.findElement(By.id("autocomplete")).sendKeys("UNIT");
		int i = 0;
		String text = null;
		JavascriptExecutor javaExecute = (JavascriptExecutor) driver;
		do {
			i++;
			driver.findElement(By.id("autocomplete")).sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(2000);
			String script = "return document.getElementById(\"autocomplete\").value;";
			text = (String) javaExecute.executeScript(script);
			System.out.println(text);

			if (i > 10) {
				System.out.println("Sorry, text not found");
				break;
			}
		} while (!text.equalsIgnoreCase("United States"));

		if (i <= 10)
			driver.findElement(By.id("autocomplete")).sendKeys(Keys.ENTER);
	}
}
