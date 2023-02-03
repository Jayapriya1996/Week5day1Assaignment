package week3day1;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChittorgarhTable {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.chittorgarh.com/");
		driver.findElement(By.id("navbtn_stockmarket")).click();
		driver.findElement(By.linkText("NSE Bulk Deals")).click();
		List<WebElement> securityName = driver.findElements(By.xpath("//table[@class='table table-bordered table-striped table-hover w-auto']//tr/td[1]"));
		System.out.println(securityName.size());
		for(int i=0;i<securityName.size();i++)
		{
			System.out.println(securityName.get(i).getText());
		}
		Set<WebElement>dup=new LinkedHashSet<WebElement>(securityName);
		System.out.println(dup.size());
		if(securityName.size()==dup.size())
		{
			System.out.println("there is no duplicates");
		}
		else
		{
			System.out.println("There are duplicates");
		}
		
	
	
	
	
	
	
	
	
	
	
	}
	

}
