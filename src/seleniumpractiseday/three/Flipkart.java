package seleniumpractiseday.three;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WIN10\\eclipse-workspace\\seleniumpractisedaythree\\driver3\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement b=driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
		b.click();
		WebElement txtUser= driver.findElement(By.id("IiD88i _351hSN"));
		txtUser.sendKeys("kiki123");
        WebElement txtPass= driver.findElement(By.id("password"));
		txtPass.sendKeys("12345567");
		
			}}
		