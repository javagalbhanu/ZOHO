package qsp;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {

	@Test
	public void testA(){
		Reporter.log("Open the browser",true);
		Reporter.log("Close the browser",true);
	}
}
