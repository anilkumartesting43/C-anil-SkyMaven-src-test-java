package EST_SeleniumTme;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SadbasicsExp14 {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANIL CH\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
}
public void Senddata() throws InterruptedException
{
	driver.findElement(By.name("username")).sendKeys("anilkumartesting43@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.name("pw")).sendKeys("Anil12345@");
	Thread.sleep(2000);
	driver.findElement(By.name("Login")).click();
}
public void getTitle() throws IOException, InterruptedException
{
	String act_out=driver.getTitle();
	System.out.println(act_out);
	String exp_out="WelCome to Sales force";
	if(act_out.equals(exp_out))
	{
		System.out.println("test case is pass");
	}
	else
	{
		//if test case is faild take screen shot
		//we need that particular file location 
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\ANIL CH\\Desktop\\IMP Notes\\Anil.jpg");
		FileHandler.copy(src, dest);
		Thread.sleep(1000);
	}
}
	public void closeAUT()
	{
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		SadbasicsExp14 obj=new SadbasicsExp14();
		obj.LaunchAUT();
		obj.Senddata();
		obj.getTitle();
		//obj.closeAUT();
	}

}
