package seleniumpractiseday.three;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Amazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WIN10\\eclipse-workspace\\seleniumpractisedaythree\\driver3\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in");
		WebElement txtUser= driver.findElement(By.id("twotabsearchtextbox"));
		txtUser.sendKeys("iphone");
		WebElement b= driver.findElement(By.xpath("//input[@value='Go']"));
	    b.click();
	}
}
