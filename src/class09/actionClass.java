package class09;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class actionClass {
    public static void main(String[] args) {


      System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    driver.get("http://amazon.com/");

}}
