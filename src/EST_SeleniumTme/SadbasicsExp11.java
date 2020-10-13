package EST_SeleniumTme;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SadbasicsExp11 {
	WebDriver driver;

	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANIL CH\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
	}
	public void Senddata(String username, String password) throws InterruptedException
	{
		driver.findElement(By.id("username")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.id("Login")).click();
		Thread.sleep(2000);
	}
	public void pageSrc() throws IOException
	{
		String src=driver.getPageSource();
		System.out.println("the page src:"+src);
		if(src.contains("please check your username and password."))
		{
			System.out.println("test case pass");
		}
		else
		{
			System.out.println("test case faild");
		}
		
	}
	public void closeAUT()
	{
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		SadbasicsExp11 obj =new SadbasicsExp11();
		obj.LaunchAUT();
		//positive testing
		obj.Senddata("anilkumartesting43@gmail.com", "Anil12345");
		//negtive test
		//obj.Senddata("pawan123@gmail.com", "pawan123@");
		//obj.Senddata("Manisha1234@gmail.com", "manish12@");
		//obj.Senddata("Shwetha32@gmail.com", "shwetha32@");
		obj.pageSrc();
		obj.closeAUT();
		
	}

}
