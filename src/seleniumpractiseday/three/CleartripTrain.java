package seleniumpractiseday.three;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CleartripTrain {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WIN10\\eclipse-workspace\\seleniumpractisedaythree\\driver3\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		WebElement txtsrc=driver.findElement(By.id("from_station"));
		txtsrc.sendKeys("chennai");
		WebElement txtdest=driver.findElement(By.id("to_station"));
		txtdest.sendKeys("virudhachalam");
		WebElement b=driver.findElement(By.xpath("//button[@id='trainFormButton']"));
		b.click();
		
	}
}
