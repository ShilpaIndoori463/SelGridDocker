package selenium.grid.docker.selenium.grid.docker;

import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Chrometwo {
	
	@Test (groups="docker")
	 static void Test1() throws MalformedURLException {
		
		ChromeOptions co=new ChromeOptions();
		RemoteWebDriver driver= new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),co);
		driver.get("https://drive.google.com/drive/my-drive");
		System.out.println("Chrome 2 session title : "+driver.getTitle());
		driver.quit();
	}

}
