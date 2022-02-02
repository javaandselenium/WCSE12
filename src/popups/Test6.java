package popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Test6 {

	public static void main(String[] args) {
		//chrome
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(option);
		
		
		//firefox
		FirefoxOptions ffoptions=new FirefoxOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver1=new FirefoxDriver(ffoptions);
		
		
		
		


		
		driver.manage().window().maximize();
		driver.get("https://www.olx.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


	}

}
