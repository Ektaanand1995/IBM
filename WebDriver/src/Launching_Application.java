import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launching_Application {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\acs\\Downloads\\geckodriver-v0.29.0-win64.exe");
		//WebDriver driver= new ChromeDriver();
		
		WebDriver driver = new FirefoxDriver(); 
		
		driver.get("www.imdb.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Go to search box & Enter games of thrones
		driver.findElement(By.xpath("//*[@id=\"suggestion-search\"]")).sendKeys("games of thrones");
		
		//Click on S4earch icon at the right hand side
		driver.findElement(By.xpath("//*[@id=\"suggestion-search-button\"]/svg")).click();
		
		// from the search result Click on Game of Thrones (2011) (TV Series) video
	
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/table/tbody/tr[3]/td[2]/ah")).click();
		
		//Playing the video
		driver.findElement(By.xpath("//*[@id=\"title-overview-widget\"]/div[1]/div[4]/div[2]/div[2]/div")).click();
		
		
	}
	
	}


