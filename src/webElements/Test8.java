package webElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 {

	public static void main(String[] args) {

WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
WebElement login = driver.findElement(By.name("login"));
if(login.isEnabled()) {
	System.out.println("Pass:element is enabled");
	login.click();
}

else
{
	System.out.println("Fail:element is not enabled");
}

driver.close();
	}

}
