import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test1 {


    WebDriver driver=null;
    @Test
    public void LaunchChrome()
    {
        System.setProperty("webdriver.chrome.driver","/Users/preranabhatt/Desktop/testfolder/dockertest/src/main/resources/chromedriver");

        driver= new ChromeDriver();

        driver.get("http:www.google.com");
    }
}
