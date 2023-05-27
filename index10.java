import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class MyTest2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\sal\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://www.saucedemo.com");
		 //locate user name --tag#id
		 driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
//  locate password - tag[attribute=value]
		 driver.findElement(By.cssSelector("input[name=password]")).sendKeys("secret_sauce");
		 //locate login button using tag value of class name
		 driver.findElement(By.cssSelector("input.submit-button")).click();
		 String currWindowHandle = driver.getWindowHandle();
			driver.switchTo().window(currWindowHandle);
			
			
			// tag.valueClass[attribute=value]
			 driver.findElement(By.cssSelector("button.btn[name=add-to-cart-sauce-labs-backpack]")).click();
			//tag[attribute$=substring]
			 
			 driver.findElement(By.cssSelector("button[name*=light]")).click();
			 
		 
	}

}
