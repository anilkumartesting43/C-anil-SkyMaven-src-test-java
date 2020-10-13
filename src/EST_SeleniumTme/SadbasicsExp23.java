package EST_SeleniumTme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SadbasicsExp23 {
	WebDriver driver;
	public void launchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANIL CH\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	public void CountIframe()
	{
		int iframe_count=driver.findElements(By.tagName("iframe")).size();
		System.out.println("the number of iframes:"+iframe_count);
	}
	public void dragandDrop() throws InterruptedException
	{
		//switch frame to iframe
		driver.switchTo().frame(0);
		WebElement src=driver.findElement(By.id("draggable"));
		WebElement des=driver.findElement(By.id("droppable"));
		//drag and drop using actions
		Actions actobj=new Actions(driver);
		actobj.dragAndDrop(src, des).perform();
		Thread.sleep(2000);	
	}
	public void CloseAUT()
	{
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		SadbasicsExp23 obj=new SadbasicsExp23();
		obj.launchAUT();
		obj.CountIframe();
		obj.dragandDrop();
		//obj.CloseAUT();

	}

}
