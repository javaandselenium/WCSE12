package dropDown;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test4 {

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
		
		List<WebElement> options = s.getOptions();
		System.out.println(options.size());
		
		ArrayList list=new ArrayList();
		
		for(WebElement allOptions:options) {
			String text = allOptions.getText();
			System.out.println(text);
			list.add(text);
		}
		
		Collections.sort(list);
		
		System.out.println("*******after sorting*********");
		
		for( Object b:list) {
			System.out.println(b);
		}
		driver.close();

	}

}
