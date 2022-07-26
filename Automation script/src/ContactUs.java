import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ContactUs {

	@Test
	public void contactus()
	{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://mobileworld.azurewebsites.net/");
    driver.manage().window().maximize();
    driver.findElement(By.linkText("Support")).click();
    driver.findElement(By.linkText("Contact Us")).click();
    

    Set<String> windows = driver.getWindowHandles(); 
    Iterator<String> it = windows.iterator();
    String parentId = it.next();
    String childId = it.next(); 
    driver.switchTo().window(childId);
    
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Virat");
    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abcdef@gmail.com");
    driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9876543210");
    driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys("This mobile is hanging more often");
    driver.findElement(By.xpath("//input[@value='Send']")).click();
    

	}

}
