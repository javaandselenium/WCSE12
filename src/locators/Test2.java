package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {

WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.actitime.com/login.do");
driver.findElement(By.id("username")).sendKeys("gut478tyutyu");
driver.findElement(By.name("pwd")).sendKeys("jtayddfdfh");
driver.findElement(By.xpath("//div[text()='Login ']")).click();
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
driver.close();


	}

}
