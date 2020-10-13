package EST_SeleniumTme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SAdbasicsExp9 {
	WebDriver driver;
public void LaunchAUT() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANIL CH\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
}
public void Senddata() throws InterruptedException
{
	driver.findElement(By.name("q")).sendKeys("i phone");
	Thread.sleep(2000);
	driver.findElement(By.name("btnK")).click();
}
public void CloseAUT()
{
	driver.close();
}
	public static void main(String[] args) throws InterruptedException {
		SAdbasicsExp9 obj =new SAdbasicsExp9();
		obj.LaunchAUT();
		obj.Senddata();
		obj.CloseAUT();
		
	}

}
