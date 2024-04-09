package CommonProgram;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AlertPopUp {
	
	
	WebDriver driver;
	@Test(priority=1)
	
	public void login() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ADMIN\\Documents\\sonaliD\\selenium\\geckodriver.exe");
		 driver=new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	}
	
	@Test(priority=2)
	public void get() {
    driver.findElement(By.name("proceed")).click();
		
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
	}

}
