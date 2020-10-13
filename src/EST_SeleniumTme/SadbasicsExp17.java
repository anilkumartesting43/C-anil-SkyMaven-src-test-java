  package EST_SeleniumTme;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SadbasicsExp17 {
	WebDriver driver;
 public void LaunchAUT() throws InterruptedException
 {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANIL CH\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
	 Thread.sleep(2000);
	 driver.manage().window().maximize();
	 
 }
 public void MultiSelectOption() throws InterruptedException
 {
	 //switch to driver object from page to iframe
	driver.switchTo().frame("iframeResult");
	 //automate multiselector
	 WebElement we=driver.findElement(By.name("cars"));
	 //create obj to select method
	 Select slcobj=new Select(we);
	 if(slcobj.isMultiple())
	 {
		 System.out.println("this is multi selector");
		 //select multiful options
		 slcobj.selectByVisibleText("Audi");
		 Thread.sleep(2000);
		 slcobj.selectByValue("volvo");
		 Thread.sleep(2000);
		 //print all selected options
		 List<WebElement>allselectoptions=slcobj.getAllSelectedOptions();
		 for(int i=0;i<allselectoptions.size();i++)
		 {
			 String option=allselectoptions.get(i).getText();
			 System.out.println("selected options is:"+option);
		 }
		 Thread.sleep(4000);
		 //deselect options
		 slcobj.deselectByVisibleText("Audi");
		 Thread.sleep(2000);
		 slcobj.deselectAll();
	 }
	 else
	 {
		 System.out.println("this is not multiSelector");
	 }
	 //switch has driver object from frame to page
	 driver.switchTo().defaultContent();
	 Thread.sleep(2000);
	 
 }
 public void getframeMsg() throws InterruptedException
 {
	 String msg=driver.findElement(By.xpath("//span[@id='framesize']")).getText();
	 System.out.println("the msg is:"+msg);
	 Thread.sleep(2000);
 }
 public void CloseAUT()
 {
	 driver.close();
 }
	public static void main(String[] args) throws InterruptedException {
		SadbasicsExp17 obj=new SadbasicsExp17();
		obj.LaunchAUT();
		obj.MultiSelectOption();
		obj.getframeMsg();
		obj.CloseAUT();

	}

}
