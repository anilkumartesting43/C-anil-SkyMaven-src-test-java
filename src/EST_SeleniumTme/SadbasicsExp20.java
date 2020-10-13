package EST_SeleniumTme;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadbasicsExp20 {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANIL CH\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.nopcommerce.com/en/demo");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	public void AdminArea() throws InterruptedException
	{
		//store parent window handle
		String p_win=driver.getWindowHandle();
		System.out.println("parent window handle:"+p_win);
		driver.findElement(By.xpath("//span[contains(text(),'Admin area')]")).click();
		Thread.sleep(2000);
		//get all windows handles
		Set<String>all_windows=driver.getWindowHandles();
		
		for(String handle:all_windows)
		{
			if(!handle.equals(p_win)) 
				System.out.println("this is child window");
			//switch to child window
			driver.switchTo().window(handle);
			//automate login admin area
			driver.findElement(By.name("Email")).sendKeys("admin@yourstore.com");
			Thread.sleep(2000);
			driver.findElement(By.id("Password")).sendKeys("admin");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
			Thread.sleep(2000);
			}
		
		
		}
		
		
	
		
	public void closeAUT()
	{
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		SadbasicsExp20 obj=new SadbasicsExp20();
		obj.LaunchAUT();
		obj.AdminArea();
		obj.closeAUT();

	}

}
