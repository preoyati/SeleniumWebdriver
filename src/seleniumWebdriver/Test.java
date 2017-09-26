package seleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "D:/geckodriver-v0.19.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='u_0_f']")).sendKeys("Test Selenium");
		Thread.sleep(7000);
		driver.quit();
	/*	
		driver.get("http://www.wikipedia.org");
		WebElement link; 
		link = driver.findElement(By.linkText("English"));
		link.click();
		Thread.sleep(5000);
		WebElement searchBox;
		searchBox = driver.findElement(By.id("searchInput"));
		searchBox.sendKeys("Software");
		Thread.sleep(5000);
		driver.quit();*/

	}

}
