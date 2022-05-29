package seleniumpractiseday.three;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WIN10\\eclipse-workspace\\seleniumpractisedaythree\\driver3\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		WebElement b= driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"));
		b.click();
		WebElement c= driver.findElement(By.xpath("//span[@class='newUserRegister']"));
		c.click();
		WebElement txtUser= driver.findElement(By.id("text"));
		txtUser.sendKeys("9940638658");
		WebElement d=driver.findElement(By.xpath("//button[@id='checkUser']"));
		d.click();
		
		
		
		
	}

}
