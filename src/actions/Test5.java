package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test5 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement electronics = driver.findElement(By.xpath("//a[text()='Men']"));

		Actions a=new Actions(driver);
		a.moveToElement(electronics).perform();

	}

}
