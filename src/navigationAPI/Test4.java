package navigationAPI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.ebay.com/");

driver.navigate().to("https://www.facebook.com/");

//back
driver.navigate().back();

Thread.sleep(3000);
//forward
driver.navigate().forward();

Thread.sleep(3000);
//refresh
driver.navigate().refresh();

Thread.sleep(3000);
driver.close();

		


	}

}
