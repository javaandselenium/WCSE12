package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test6 {
	//public static WebDriver driver;
	
	public static void testBrowser(WebDriver driver) {
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}
	

	public static void main(String[] args) {
 WebDriver driver=new ChromeDriver();
 Test6.testBrowser(driver);
 Test6.testBrowser(new FirefoxDriver());

	}

}
