import java.util.List;
import java.util.Set;
import java.util.ArrayList;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenNewTabOrWindow {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\sal\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println("First page :" + driver.getTitle());
		
		// open new tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/");
		System.out.println("second tab :" + driver.getTitle());
		
		//get window handles of open windows
	Set <String> windowHandles=	driver.getWindowHandles();
	List <String> handles = new ArrayList<String>();
	
	handles.addAll(windowHandles);
	
	driver.close();
	driver.switchTo().window(handles.get(0));//switch to google.com
	
	System.out.println("First page :" + driver.getTitle());
	
		

	}

}
