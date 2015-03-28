import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sun.corba.se.spi.orbutil.fsm.Action;

public class TestClass {
	public static WebDriver driver;

	@BeforeClass
	public void fi() {
		System.out.println("Welcome to the magic world");
		driver = Browsers.brs("CH");
		driver.get("http://localhost:8080/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public static void set() {

		for (int i = 1000; i < 1005; i++) {
			driver.findElement(By.linkText("New Item")).click();
			driver.findElement(By.xpath("//*[@id='name']")).sendKeys(
					"Project No- "+i+" on "+new SimpleDateFormat("yyyy-MM-dd hh-mm").format(new Date()));
			System.out
					.println(driver
							.findElement(
									By.xpath("//*[@id='main-panel-content']/form/table/tbody/tr[3]/td/input"))
							.isSelected());
			driver.findElement(
					By.xpath("//*[@id='main-panel-content']/form/table/tbody/tr[3]/td/input"))
					.click();
			driver.findElement(By.xpath("//*[@id='ok-button']")).click();
			driver.findElement(
					By.xpath("//*[@id='main-panel-content']/form/table/tbody/tr[3]/td[3]/textarea"))
					.sendKeys("This is a demo project");
			driver.findElement(By.xpath("//*[@id='yui-gen38-button']")).click();
			driver.findElement(By.xpath("//*[@id='tasks']/div[1]/a[2]"))
					.click();
		}
	}

	@Test(enabled = false)
	public static void del() {
		driver.findElement(By.xpath("//div[@id='menuSelector']")).click();

	}

	@AfterClass
	public void waitt() throws InterruptedException {
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.close();
	}

}