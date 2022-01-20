package basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test5 {

	public static void main(String[] args) {

ChromeDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
driver.close();


FirefoxDriver driver1=new FirefoxDriver();
driver1.get("https://www.facebook.com/");
System.out.println(driver1.getTitle());
System.out.println(driver1.getCurrentUrl());
driver1.close();



	}

}
