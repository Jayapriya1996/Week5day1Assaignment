package week3day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundTableAsg4 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://leafground.com/table.xhtml");
		List<WebElement> rowCount = driver.findElements(By.xpath("(//table)[6]//tr"));
		System.out.println(rowCount.size());
		List<WebElement> columnCount = driver.findElements(By.xpath("(//table)[6]//th"));
		System.out.println(columnCount.size());
		for(int i=0;i<rowCount.size();i++)
		{
			System.out.println(rowCount.get(i).getText());
		}
		 String name = driver.findElement(By.xpath("(//table[@role='grid'])[2]//tr[7]//td[1]")).getText();
		 System.out.println(name);
		String country= driver.findElement(By.xpath("(//table[@role='grid'])[2]//tr[8]//td[2]")).getText();
		System.out.println(country);
		String representative = driver.findElement(By.xpath("(//table[@role='grid'])[2]//tr[5]//td[3]")).getText();
		System.out.println(representative);
		String joiningDate = driver.findElement(By.xpath("(//table[@role='grid'])[2]//tr[4]//td[4]")).getText();
		System.out.println(joiningDate);
	}

}
/*List<WebElement> absoluteUsage = driver.findElements(By.xpath("//td[text()='Absolute Usage']//following-sibling::td"));

for (int i = 0; i < absoluteUsage.size(); i++) {
	
	String text = absoluteUsage.get(i).getText();
	*/
