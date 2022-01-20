package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) {

WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://www.facebook.com/");
driver.findElement(By.id("email")).sendKeys("john@gmail.com");
driver.findElement(By.name("pass")).sendKeys("ttytattydfgad");
//driver.findElement(By.linkText("Forgotten password?")).click();
driver.findElement(By.partialLinkText("Forgotten")).click();


	}

}
