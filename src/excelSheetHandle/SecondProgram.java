package excelSheetHandle;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SecondProgram 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement username=driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
	    username.sendKeys("9975214942");
		
		WebElement password=driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
	    password.sendKeys("Test@2022");
				
		
	    WebElement loginButton=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
	    loginButton.click();
	    
	    
		 WebElement m=driver.findElement(By.xpath("//div[text()='Electronics']"));
		  
		 Actions x=new Actions(driver);
		 
		 x.moveToElement(m).perform();
		// Thread.sleep(3000);
		 WebElement lap=driver.findElement(By.xpath("(//a[@class='_6WOcW9'])[6]"));
         x.click(lap).perform();
         
         WebElement lap1=driver.findElement(By.xpath("//div[text()='MSI Pulse GL66 Core i7 11th Gen - (16 GB/1 TB SSD/Windows 10 Home/8 GB Graphics/NVIDIA GeForce RTX 307...']"));
         x.click(lap1).perform();
         
       List <String> l=new ArrayList<String>( driver.getWindowHandles());
        
       driver.switchTo().window(l.get(1));
//       
//       
//      WebElement cart=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
//       cart.click();  
//         
         
         
         
         
         
         
         
		               
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
