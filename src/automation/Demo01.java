package automation;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Demo01 
{
	public static WebDriver driver;
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
	
		  driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	  Date d=new Date();
	  SimpleDateFormat d1=new SimpleDateFormat("dd-MM-yy&hh:mm:ss");
	   String time= d1.format(d);
	   String timestag=time.replace("-", "").replace("&", "").replace(":", "");
	  TakesScreenshot sc=(TakesScreenshot)driver;
	  
	  
	  File f=sc.getScreenshotAs(OutputType.FILE);
	  
	  File l=new File("./ScreenShot/image"+timestag+".jpg");
	  
	  FileHandler.copy(f, l);
	  
	  
	}

}
