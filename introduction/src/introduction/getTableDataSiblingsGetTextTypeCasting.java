package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTableDataSiblingsGetTextTypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c://users//halil//downloads//00programs//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22082/uae-vs-nep-1st-t20i-nepal-tour-of-uae-2019");

		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']")); // Narrow the scope																													

		int benim = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div[class='cb-col cb-col-8 text-right text-bold']")).size();
		int instructor = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
        int sum=0;
        int extra=0;
        int total;
        String text=null;
		for (int x = 0; x < benim; x++) {
			System.out.print(table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div[class='cb-col cb-col-8 text-right text-bold']")).get(x).getText() + " ");
			text = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div[class='cb-col cb-col-8 text-right text-bold']")).get(x).getText();
			sum = sum + Integer.parseInt(text);
		}
		System.out.println(sum);

		for (int x = 0; x < instructor - 2; x++) {
			System.out.print(table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(x).getText() + " ");
		}
		
		//System.out.println(table.findElement(By.xpath("//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr']/div[11]/div[@class='cb-col cb-col-8 text-bold cb-text-black text-right']")).getText());
		
		System.out.println(table.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText());
		text = table.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		extra = Integer.parseInt(text);
		sum = sum + extra;
		System.out.println(table.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText());
		
		text = table.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		total = Integer.parseInt(text);
		
		if(sum==total)
			System.out.println("WELL DONE");
		
	}

}
