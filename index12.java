import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class RightClick {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\sal\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		 WebElement button = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
         
		 Actions act = new Actions(driver);
		 act.contextClick(button).perform(); //right click action
		 
		 
	}

}
