package seleniumpractiseday.three;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\WIN10\\eclipse-workspace\\seleniumpractise\\driver\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement txtUser= driver.findElement(By.id("email"));
	txtUser.sendKeys("kiki123@gmial.com");
	WebElement txtPass = driver.findElement(By.name("pass"));
	txtPass.sendKeys("2340954389");
	WebElement b= driver.findElement(By.xpath("//BUTTON[@type=\'submit\']"));
	b.click();
	}}

