import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\sal\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://dribbble.com/tags/food%20website");
	
		WebElement element = driver.findElement(By.id("tags-show"));
		Select dropdown = new Select(element);
		
		//dropdown.selectByVisibleText("Latest");
		//dropdown.selectByValue("2");
		//dropdown.selectByIndex(2);

	}

}
