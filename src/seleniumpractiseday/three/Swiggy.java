package seleniumpractiseday.three;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WIN10\\eclipse-workspace\\seleniumpractisedaythree\\driver3\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		WebElement b= driver.findElement(By.xpath("//a[@class='r2iyh']"));
		b.click();
		WebElement txtNum= driver.findElement(By.name("mobile"));
		txtNum.sendKeys("9940638658");
		WebElement txtName= driver.findElement(By.id("name"));
		txtName.sendKeys("kiki");
		WebElement txtEmail= driver.findElement(By.name("email"));
		txtEmail.sendKeys("kiki123@gmail.com");
		WebElement txtPass= driver.findElement(By.name("password"));
		txtPass.sendKeys("kiki_123");
		WebElement c= driver.findElement(By.xpath("//a[@class='a-ayg']"));
		c.click();
		
	}

}
