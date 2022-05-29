package seleniumpractiseday.three;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazontwo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","\r\n" + 
				"C:\\Users\\WIN10\\eclipse-workspace\\seleniumpractisedaythree\\driver3\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement b= driver.findElement(By.xpath("//a[@class='nav-a nav-hasArrow']"));
		b.click();
		
	}

}
