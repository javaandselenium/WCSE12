package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
	@Test(invocationCount = 5)
	public void demo() {
		Reporter.log("hello",true);
	}

}
