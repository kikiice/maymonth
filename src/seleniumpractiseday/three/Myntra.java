package seleniumpractiseday.three;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WIN10\\eclipse-workspace\\seleniumpractisedaythree\\driver3\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.myntra.com/login");
		//WebElement txtUser=driver.findElement(By.name("placeholderAlternative mobileNumber"));
		//txtUser.sendKeys("9940638658");
		WebElement b=driver.findElement(By.xpath("//div[@class='submitBottomOption']"));
		b.click();
		
	}

}
