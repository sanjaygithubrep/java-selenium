import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\sal\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

		//find source and target web element
		
		WebElement source = driver.findElement(By.id("box6")); //rome
		WebElement target = driver.findElement(By.id("box106")); //italy
		
		 Actions act = new Actions(driver);
		 //dragAndDrop(sourceElement, targetElement)
		 act.dragAndDrop(source,target).perform();
	}

}
