import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Order {

	@Test
	public void order() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mobileworld.azurewebsites.net/");
       // driver.findElement(By.xpath("//a[@href='#']")).click();
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Support")).click();
        driver.findElement(By.linkText("Order")).click();
        

        
        Set<String> windows = driver.getWindowHandles(); 
        Iterator<String> it = windows.iterator();
        String parentId = it.next();
        String childId = it.next(); 
        driver.switchTo().window(childId);
        
       //Thread.sleep(3000);
        /*List<WebElement> ele = driver.findElements(By.className("form-control"));
        ele.get(0).sendKeys("Virat");
        ele.get(1).sendKeys("kohli");*/
        driver.findElement(By.xpath("//div[@class='container']/div[1]/div[2]/form[1]/div[1]/div[1]/input")).sendKeys("Virat");
        driver.findElement(By.xpath("//div[@class='container']/div[1]/div[2]/form[1]/div[1]/div[2]/input")).sendKeys("Kohli");
        driver.findElement(By.id("inputEmail")).sendKeys("abcdef@gamil.com");
        driver.findElement(By.id("inputPassword")).sendKeys("abc@123");
        driver.findElement(By.id("flexRadioDefault1")).click();
        driver.findElement(By.xpath("//div[1]/div[1]/div[2]/form[1]/div[3]/div[4]/input[1]")).sendKeys("9876543210");
        driver.findElement(By.id(" address1")).sendKeys("Nandi Apartment");
        driver.findElement(By.id("address2")).sendKeys("Gandhi street");
        driver.findElement(By.id("inputCity")).sendKeys("Bengaluru");
        driver.findElement(By.id("inputState")).click();
        
        WebElement staticDropdown=driver.findElement(By.id("inputState"));
        Select dropdown=new Select(staticDropdown);
        dropdown.selectByIndex(2);
        
        driver.findElement(By.id("inputZip")).sendKeys("560001");
        driver.findElement(By.xpath("//input[@rel='lenovo']")).click();
        driver.findElement(By.xpath("//input[@rel='samsung']")).click();
        driver.findElement(By.xpath("//div[1]/div[2]/form[1]/fieldset[1]/div[1]/div[3]/div[1]/div[2]/select[1]/option[3]")).click();
        driver.findElement(By.xpath("//*[@placeholder='no of mobiles']")).sendKeys("1");
        
        WebElement staticDropdown2=driver.findElement(By.id("bought"));
        Select dropdown3=new Select(staticDropdown2);
        dropdown3.selectByIndex(1);
        
        List<WebElement> elem = driver.findElements(By.id("gridCheck1"));
        elem.get(0).click();
        elem.get(1).click();
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
       // System.out.println(driver.findElement(By.xpath("//div[@class='modal-body']")).getText());
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@class='btn btn-secondary']")).click();
        
         //driver.close();
        

	}

}
