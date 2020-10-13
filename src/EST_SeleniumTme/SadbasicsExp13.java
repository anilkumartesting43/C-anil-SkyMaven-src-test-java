package EST_SeleniumTme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SadbasicsExp13 {
	WebDriver driver;
  public void LaunchAUT() throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANIL CH\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.salesforce.com/form/signup/freetrial-elf-v2-expc/?d=cta-li-promo-147");
	  Thread.sleep(2000);
	  driver.manage().window().maximize();
  }
  public void Dropdown() throws InterruptedException
  {
	  //automate select dropdown
	 WebElement we=driver.findElement(By.name("CompanyEmployees"));
	 //create obj for select class
	 Select slcobj=new Select(we);
	 //select option by using visible test
	 slcobj.selectByVisibleText("21 - 200 employees");
	 Thread.sleep(2000);
	 slcobj.selectByValue("10");
	 Thread.sleep(2000);
	 slcobj.selectByIndex(3);
	 Thread.sleep(2000);
	 
  }
  public void CountryName() throws InterruptedException
  {
	  WebElement we1=driver.findElement(By.name("CompanyCountry"));
	  Select slcobj1 =new Select(we1);
	  slcobj1.selectByVisibleText("France");
	  Thread.sleep(2000);
	  slcobj1.selectByValue("BZ");
	  Thread.sleep(2000);
	  slcobj1.selectByIndex(7);
	  Thread.sleep(2000);
  }
  
  public void fillform()
  {
	 driver.findElement(By.name("CompanyName")).sendKeys("UGH"); 
	 
  }
  public void Submit() throws InterruptedException
  {
	  driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
	  Thread.sleep(2000);
  }
  public void filldetails() throws InterruptedException
  {
	  driver.findElement(By.name("UserFirstName")).sendKeys("Anil");
	  Thread.sleep(2000);
	  driver.findElement(By.name("UserLastName")).sendKeys("Kumar");
	  Thread.sleep(2000);
	  driver.findElement(By.name("UserTitle")).sendKeys("iT_Manger");
	  Thread.sleep(2000);
  }
  public void Next() throws InterruptedException
  {
	  driver.findElement(By.xpath("//a[contains(@class,'btn btn-primary salesforce-sans-regular')]")).click();
	  Thread.sleep(2000);
  }
  public void closeAUT()
  {
	  driver.close();
  }
  

	public static void main(String[] args) throws InterruptedException {
		SadbasicsExp13 obj=new SadbasicsExp13();
		obj.LaunchAUT();
		obj.Dropdown();
		obj.fillform();
		obj.CountryName();
		obj.Submit();
		obj.filldetails();
		obj.Next();
		obj.closeAUT();
		
	}

}
