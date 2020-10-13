package EST_SeleniumTme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SadbasicsExp26 {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANIL CH\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.salesforce.com/in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	public void RightClick() throws InterruptedException
	{
		WebElement we2=driver.findElement(By.id("about-us_menu_item"));
		Actions actobj=new Actions(driver);
		actobj.contextClick(we2).perform();
		Thread.sleep(2000);
		
	}
	public void closeAUT()
	{
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		SadbasicsExp26 obj =new SadbasicsExp26();
		obj.LaunchAUT();
		obj.RightClick();
		obj.closeAUT();

	}

}
