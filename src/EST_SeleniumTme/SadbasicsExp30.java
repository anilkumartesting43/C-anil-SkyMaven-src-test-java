package EST_SeleniumTme;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadbasicsExp30 {
	WebDriver driver;
	JavascriptExecutor jse;
	public void launcAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANIL CH\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://platform.cloudways.com/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	public void disableElmnt() throws InterruptedException
	
	{
		WebElement we1 = driver.findElement(By.id("userEmail"));
		// disable element
		jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].setAttribute('disabled','true')", we1);
		Thread.sleep(2000);
		jse.executeScript("arguments[0].value='disabled';", we1);
		Thread.sleep(2000);
	}
	public void refreshPage()
	{
		//driver.navigate().refresh();
		// refresh page by js
		jse.executeScript("history.go(0);");
		
	}
	public void customAlertJS() throws InterruptedException
	{
		// create alert
		jse.executeScript("alert('Hello World');");
		Thread.sleep(2000);
		// handle alert
		driver.switchTo().alert().accept();
	}
	public void getTitleJS() throws InterruptedException
	{
		//driver.getTitle();
		// fetch title using JSE
		String title = jse.executeScript("return document.title;").toString();
		System.out.println("Title is:" +title);
		Thread.sleep(2000);
	}
	public void closeAUT()
	{

		
		driver.quit();
	}
	public static void main(String[] args) throws InterruptedException 
	{
		SadbasicsExp30 obj = new SadbasicsExp30();
		obj.launcAUT();
		obj.disableElmnt();
		obj.refreshPage();
		obj.customAlertJS();
		obj.getTitleJS();
		obj.closeAUT();

	}

}



