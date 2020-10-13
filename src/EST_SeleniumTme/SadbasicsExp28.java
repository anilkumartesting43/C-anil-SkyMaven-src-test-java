package EST_SeleniumTme;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadbasicsExp28 {
	WebDriver driver;
	JavascriptExecutor jse;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANIL CH\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	public void Click() throws InterruptedException
	{
		jse=(JavascriptExecutor)driver;
		WebElement we1=driver.findElement(By.id("Login"));
		jse.executeScript("arguments[0].click();", we1);
		Thread.sleep(2000);
		
	}
	public void Senddata() throws InterruptedException
	{
		jse=(JavascriptExecutor)driver;
		WebElement we2=driver.findElement(By.id("username"));
		jse.executeScript("arguments[0].value='anilkumartesting43@gmail.com';", we2);
		Thread.sleep(2000);
		WebElement we3=driver.findElement(By.name("pw"));
		jse.executeScript("arguments[0].value='Anil12345@';", we3);
		Thread.sleep(2000);
		
	}
	public void HeightLight() throws InterruptedException
	{
		jse=(JavascriptExecutor)driver;
		WebElement we4=driver.findElement(By.name("pw"));
		jse.executeScript("arguments[0].style='border:5px dotted red';", we4);
		Thread.sleep(2000);
	}
	public void CloseAUT()
	{
		driver.close();
	}
	

	public static void main(String[] args) throws InterruptedException {
		SadbasicsExp28 obj =new SadbasicsExp28();
		obj.LaunchAUT();
		obj.Senddata();
		obj.HeightLight();
		obj.Click();
		obj.CloseAUT();

	}

}
