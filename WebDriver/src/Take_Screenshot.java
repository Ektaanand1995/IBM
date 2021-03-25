import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class Take_Screenshot {

    

    public void Take_Screenshot() throws Exception{

		WebDriver driver ;
    	System.setProperty("webdriver.gecko.driver","C:\\Users\\acs\\Downloads\\geckodriver-v0.29.0-win64.exe");
    	driver = new FirefoxDriver();

        //goto url

        driver.get("www.imdb.com");

        //Call take screenshot function

        this.takeSnapShot(driver, "c://test.png") ;     

    }

    public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File(fileWithPath);

                //Copy file at destination

                Files.copyFile(SrcFile, DestFile);

    }

}