import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;




public class ScreenshotCapture {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "F:\\sal\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.codewithharry.com/");
		
		//capture full page of screenshot
		//step 1 = convert web driver object to take screenshot interface
		
		//TakesScreenshot screenshot = ((TakesScreenshot) driver);

		//step 2 call get screenshot method to create image file
		//File src = screenshot.getScreenshotAs(OutputType.FILE);
    // File dest = new File("C:\\Users\\Acer\\Desktop\\Screnshot\\fullPage.png");
     
     //step:3 copy image file to destination
   //  FileUtils.copyFile(src, dest);
//_____________________________________________________________;
		//step 1 half screenshot
		
     //TakesScreenshot screenshot = ((TakesScreenshot) driver);
WebElement section = driver.findElement(By.xpath("//div[@class='flex items-center text-center lg:text-left px-8 md:px-12 lg:w-1/2']"));
		//step 2 call get screenshot method to create image file
		File src = section.getScreenshotAs(OutputType.FILE);
  File dest = new File("C:\\Users\\Acer\\Desktop\\Screnshot\\halfPage.png");
  
  //step:3 copy image file to destination
  FileUtils.copyFile(src, dest);
	}

}
