import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class CountRadioButton {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\sal\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://udyamregistration.gov.in/Udyam_Login.aspx");
		
		List <WebElement> radioButtonList = driver.findElements(By.xpath("//input[@type='radio']"));
	System.out.println("Total no. of radio button on web page: "+ radioButtonList.size());
	driver.close();
	
	}
	

}
