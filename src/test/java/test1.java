import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class test1 {


    WebDriver driver = null;

    @Test
    public void LaunchChrome() throws MalformedURLException {
        // System.setProperty("webdriver.chrome.driver", "/Users/preranabhatt/Desktop/testfolder/dockertest/src/main/resources/chromedriver");

        DesiredCapabilities dc = DesiredCapabilities.chrome();
        driver = new RemoteWebDriver(new URL("http://192.168.1.10:4444/wd/hub"), dc);


        //    driver = new ChromeDriver();

        driver.get("http:www.google.com");
    }

}
