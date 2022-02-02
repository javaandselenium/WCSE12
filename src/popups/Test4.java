package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//new tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com/");

		String parent= driver.getWindowHandle();
		System.out.println(parent);
		Set<String> child = driver.getWindowHandles();

		System.out.println(child);
		
		for(String b:child ) {
			driver.switchTo().window(b);
		}
driver.findElement(By.name("q")).sendKeys("phone");		
		
		
		//driver.quit();

	}

}
