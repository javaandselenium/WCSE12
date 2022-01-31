package windowManage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver=new ChromeDriver();
//maximize the browser
driver.manage().window().maximize();
driver.get("https://www.flipkart.com/");

Thread.sleep(5000);
//minimize the browser
driver.manage().window().minimize();

//full screen
Thread.sleep(5000);
driver.manage().window().fullscreen();




	}

}
