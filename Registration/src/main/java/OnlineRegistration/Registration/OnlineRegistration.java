package OnlineRegistration.Registration;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class OnlineRegistration {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Qapitol\\Downloads\\geckodriver-v0.25.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.cii.in/OnlineRegistration.aspx");
		Select select = new Select(driver.findElement(By.xpath("//select[@id='drpAttendee']")));
		select.selectByVisibleText("3");
		Select select1 = new Select(driver.findElement(By.xpath("//select[@id='Gridview1_ctl02_drpTitle']")));
		select1.selectByVisibleText("Admiral");
		Select select2 = new Select(driver.findElement(By.id("Gridview1_ctl03_drpTitle")));
		select2.selectByVisibleText("CA");
		Select select3 = new Select(driver.findElement(By.name("Gridview1$ctl04$drpTitle")));
		select3.selectByVisibleText("CS");
		Select dropDown = new Select(driver.findElement(By.id("drpRegTitle")));
		List<WebElement> e = dropDown.getOptions();
		int itemCount = e.size();

		for(int l = 0; l < itemCount; l++)
		{
		    System.out.println(e.get(l).getText());
		}
	}
}
