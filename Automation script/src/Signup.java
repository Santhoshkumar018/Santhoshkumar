import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Signup {

	    @Test
	    public void signup()
	    {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mobileworld.azurewebsites.net/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@class='btn btn-warning my-2 my-sm-0']")).click();
        driver.findElement(By.xpath("//a[@href='signup.html']")).click();
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Virat");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Kohli");
        driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("abcdef@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("abc@123");
        driver.findElement(By.xpath("//input[@type='date']")).sendKeys("12-03-1999");
       // driver.findElement(By.xpath("//div[@class='container']/div[2]/form[1]/div[3]/div[3]/input")).click();
        driver.findElement(By.xpath("//div/div[2]/form[1]/div[3]/div[3]/input")).click();
        driver.findElement(By.xpath("//input[@type='number']")).sendKeys("9876543210");
        driver.findElement(By.xpath("//*[@placeholder='Short Bio']")).sendKeys("Be Happy");
        driver.findElement(By.xpath("//*[@type='Submit']")).click();
        driver.switchTo().alert().accept();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abcdef@gmail.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abc@123");
        driver.findElement(By.xpath("//a[@class='btn btn-primary btn-block']")).click();
	}

}
