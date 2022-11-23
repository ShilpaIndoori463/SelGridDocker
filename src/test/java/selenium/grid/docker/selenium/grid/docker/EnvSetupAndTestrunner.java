package selenium.grid.docker.selenium.grid.docker;
import java.io.IOException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EnvSetupAndTestrunner {
	
	@BeforeTest 
	
	static void startDocEnv() throws IOException, InterruptedException {
		Runtime.getRuntime().exec("cmd /c start docker-start.bat");
		Thread.sleep(25000);
		Runtime.getRuntime().exec("cmd /c start docker_scale.bat");
		Thread.sleep(25000);
	}
	
	@BeforeTest
	
	static void scaleup() throws IOException, InterruptedException
	{
		
	}
	@AfterTest
 static void stopDocEnv() throws IOException, InterruptedException {
		Runtime.getRuntime().exec("cmd /c start dockerstop.bat");
		Thread.sleep(5000);
		//Runtime.getRuntime().exec("taskkill /f /im cmd.exe");
	}
}
