import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browsers {
	public static WebDriver driver;
	
	public static WebDriver brs(String BW){
		//WebDriver driver = null;
	if(BW.equalsIgnoreCase("FF")){
		driver=new FirefoxDriver();
		System.out.println("FireFox lunched");
	}else if(BW.equalsIgnoreCase("CH")){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("Chrome lunched");
	}else if(BW.equalsIgnoreCase("IE")){
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\Drivers\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		System.out.println("IE lunched");
	}else {
		System.out.println("No broser selected");
	}
	return driver;
	}
}
