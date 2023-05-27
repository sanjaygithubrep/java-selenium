import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_xpath_Locator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\sal\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.saucedemo.com");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		String currWindowHandle = driver.getWindowHandle();
		driver.switchTo().window(currWindowHandle);
//		driver.findElement(By.linkText("Sauce Labs Bolt T-Shirt")).click();
//		driver.findElement(By.partialLinkText("Sauce")).click();
		List <WebElement> elementList = driver.findElements(By.partialLinkText("Sauce"));
		System.out.println("Element size:" +elementList.size());


	}

}
