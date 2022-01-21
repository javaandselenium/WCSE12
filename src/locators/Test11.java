package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test11 {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapp.skillrary.com/");
	
	driver.findElement(By.linkText("LOGIN")).click();
	driver.findElement(By.id("email")).sendKeys("admin");
	driver.findElement(By.id("password")).sendKeys("manager");
	
	driver.findElement(By.id("last")).click();
	
	
	String title = driver.getTitle();
	System.out.println(title);
	
	if(title.equals("SkillRary Ecommerce")) {
		System.out.println("Pass:home page is dispalyed");
	}
	else
	{
		System.out.println("Fail:home page is not dispalyed");
	}
	
	String url = driver.getCurrentUrl();
	System.out.println(url);
	
	driver.close();
	
	

	}

}
