package jenkinstestngdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGDemo {

	public static WebDriver driver;

	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver", "c:\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("signin_button")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.id("user_login")).sendKeys("username");
		driver.findElement(By.id("user_password")).sendKeys("password");
		driver.findElement(By.name("submit")).click();
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
