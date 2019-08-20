package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	WebDriver driver;
	@org.junit.Test
	public void test() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nguye\\Desktop\\automation\\abc\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://testyduoconline.com/login");
//		System.out.println(driver.getCurrentUrl());
		
		WebElement txtUser = driver.findElement(By.name("txtUser"));
		WebElement txtPass = driver.findElement(By.name("txtPass"));
		
		
		txtUser.sendKeys("nguyenson");
		txtPass.sendKeys("1234");

		
		WebElement btnL = driver.findElement(By.className("btn"));
		btnL.click();
		System.out.println(btnL);
	}
}
