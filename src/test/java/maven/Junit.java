package maven;

import java.util.Date;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Junit {
	public static WebDriver driver;

	@BeforeClass
	public static void beforeclass() {
		System.out.println("BeforeClass ==> Driver Initialization");
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\SUBASH\\eclipse-workspace\\SeleniumFrameworks\\driver\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("https://en-gb.facebook.com/");
	}

	@AfterClass
	public static void afterclass() {
		System.out.println("AfterClass ==> Browser close");
		driver.close();

	}

	@Before
	public void before() {
		System.out.println("Before ==> Start time of execution");
		Date d = new Date();
		System.out.println(d);
	}

	@After
	public void after() {
		System.out.println("After ==> End time of execution");
		Date d = new Date();
		System.out.println(d);
	}

	@Test
	public void test1() {
		System.out.println("Test1 ==> Business logic");
		WebElement Username = driver.findElement(By.id("email"));
		Username.sendKeys("bob@abc.com");
		WebElement Password = driver.findElement(By.id("pass"));
		Password.sendKeys("Pass@321");
	}

	@Test
	public void tset2() {
		System.out.println("Test2 ==> Business logic");
		WebElement btnLogIn = driver.findElement(By.name("login"));
		btnLogIn.click();

	}

}