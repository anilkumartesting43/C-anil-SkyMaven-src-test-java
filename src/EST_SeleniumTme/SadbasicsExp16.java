package EST_SeleniumTme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadbasicsExp16 {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ANIL CH\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.indiehackers.com/sign-in");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	public void ClickReset() throws InterruptedException
	{
		driver.findElement(By.linkText("Reset")).click();
		Thread.sleep(3000);
		//switchTo driver object from webpage to alert
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
	}
	public void ClickDismiss() throws InterruptedException
	{
		driver.findElement(By.linkText("Reset")).click();
		Thread.sleep(2000);
		//switch driver object webpage to alert
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
	}
	public void GetTextalert() throws InterruptedException
	{
		driver.findElement(By.linkText("Reset")).click();
		Thread.sleep(2000);
		//swich driver object from webpage to alert
		String alert_msg=driver.switchTo().alert().getText();
		System.out.println("Alert msg is:"+alert_msg);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);		
	}
	public void SendData() throws InterruptedException
	{
		driver.findElement(By.linkText("Reset")).click();
		Thread.sleep(2000);
		//senddata to alert input box
		driver.switchTo().alert().sendKeys("anilkumartesting43@gmail.com");
		Thread.sleep(2000);
	    driver.switchTo().alert().accept();
	    Thread.sleep(2000);
	    driver.switchTo().alert().accept();
	}
	public void CloseAUT()
	{
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		SadbasicsExp16 obj=new SadbasicsExp16();
		obj.LaunchAUT();
		obj.ClickReset();
		obj.ClickDismiss();
		obj.GetTextalert();
		obj.SendData();
		obj.CloseAUT();
		
	}

}
