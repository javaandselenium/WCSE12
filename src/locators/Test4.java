package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.facebook.com/");
    
    driver.findElement(By.id("email")).sendKeys("eghghae");
    driver.findElement(By.name("pass")).sendKeys("tdddrtydr");
    
    driver.findElement(By.name("login")).click();

	}

}
