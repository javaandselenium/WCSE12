package dropDown;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test5 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		WebElement monthdd = driver.findElement(By.id("month"));
		
		Select s=new Select(monthdd);
		s.selectByIndex(1);
		s.selectByValue("4");
		s.selectByVisibleText("May");
		
		List<WebElement> option = s.getAllSelectedOptions();
		System.out.println(option.size());
		
		
		
		for(WebElement allOptions:option) {
			String op = allOptions.getText();
			System.out.println(op);
			
		}
		
		
		driver.close();

	}

}
