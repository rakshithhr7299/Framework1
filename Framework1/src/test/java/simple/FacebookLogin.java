package simple;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLogin {
@Test
	public void login() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
         Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("9606822961");
		driver.findElement(By.id("pass")).sendKeys("rakshith1999hr");
		driver.findElement(By.name("login")).click();
		System.out.println(driver.getTitle());
		driver.close();
	}
}