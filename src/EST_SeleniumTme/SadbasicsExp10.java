package EST_SeleniumTme;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SadbasicsExp10 {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANIL CH\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		Thread.sleep(2000);
		driver.manage().window().maximize();
				
	}
	public void Fillloginform(String username,String password) throws InterruptedException
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
		if(src.contains("Please check Username and Password."))
		{
			System.out.println("test case is pass");
		}
		else
		{
			File src1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File des=new File("C:\\Users\\ANIL CH\\Desktop\\IMP Notes\\Anil.jpg");
			FileHandler.copy(src1, des);
		}
		
	}
	public void closeAUT()
	{
		driver.close();
	}
	
	

	public static void main(String[] args) throws InterruptedException, IOException {
		SadbasicsExp10 obj=new SadbasicsExp10();
		obj.LaunchAUT();
		obj.Fillloginform("anilkumartesting43@gmail.com", "Anil12345");
		obj.pageSrc();
		//obj.closeAUT();


	}

}
