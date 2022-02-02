package popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//new window
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		//new Tab
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.google.com/");

	}

}
