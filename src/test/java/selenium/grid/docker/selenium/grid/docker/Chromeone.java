package selenium.grid.docker.selenium.grid.docker;

import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Chromeone {
	
	@Test (groups="docker")
	 static void Test1() throws MalformedURLException {
		
		ChromeOptions co=new ChromeOptions();
		RemoteWebDriver driver= new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),co);
		driver.get("https://contacts.google.com/?hl=en&tab=wC");
		System.out.println("Chrome 1 session title : "+driver.getTitle());
		driver.quit();
	}

}
