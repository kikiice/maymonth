package seleniumpractiseday.three;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTechnologyResume {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WIN10\\eclipse-workspace\\seleniumpractisedaythree\\driver3\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement b= driver.findElement(By.xpath("//div[@id='heading201']"));
		b.click();
		WebElement c= driver.findElement(By.xpath("//a[@tite='Model Resume training in chennai'][1]"));
		c.click();
		
		
	}

}
