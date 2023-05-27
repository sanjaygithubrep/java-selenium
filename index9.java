import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MouseOver {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\sal\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sellglobal.ebay.in/seller-center/");
		
		WebElement element = driver.findElement(By.linkText("Shipping"));
		 Actions act = new Actions(driver);
		 //dragAndDrop(sourceElement, targetElement)
		 act.moveToElement(element).perform(); //moveToElement for mouse over action


		
	}

}
