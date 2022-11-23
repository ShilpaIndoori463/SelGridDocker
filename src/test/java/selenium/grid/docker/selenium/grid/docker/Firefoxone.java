package selenium.grid.docker.selenium.grid.docker;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Firefoxone {
	
	@Test (groups="docker")
	 static void Test1() throws MalformedURLException {
		
		FirefoxOptions fo=new FirefoxOptions();
		RemoteWebDriver driver= new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),fo);
		driver.get("https://drive.google.com/drive/my-drive");
		System.out.println("Firefox 1 session title : "+driver.getTitle());
		driver.quit();
	}

}
