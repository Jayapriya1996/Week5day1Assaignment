package week3day1;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableAsg3 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://html.com/tags/table/");
		List<WebElement> count = driver.findElements(By.xpath("(//table)[1]//tr[2]//td[2]"));
		System.out.println(count);
List<WebElement> absoluteUsage = driver.findElements(By.xpath("//td[text()='Absolute Usage']//following-sibling::td"));
		
		for (int i = 0; i < absoluteUsage.size(); i++) {
			
			String text = absoluteUsage.get(i).getText();
			System.out.println(text);
	}
	}
}
