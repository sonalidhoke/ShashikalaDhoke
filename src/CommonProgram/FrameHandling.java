package CommonProgram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FrameHandling {
	WebDriver driver;
	
	
	@Test
	
	public void login() {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ADMIN\\Documents\\sonaliD\\selenium\\geckodriver.exe");
		 driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/frames");
		
		
	}
	
	@Test
	public void ele() throws InterruptedException {
		driver.findElement(By.id("item-2")).click();
		driver.findElement(By.id("sampleHeading")).sendKeys("sonali");
		
//		driver.findElement(By.name("password")).sendKeys("test@123");
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//a[contains(text(), 'Contacts')]")).click();
		
		

	}

}
