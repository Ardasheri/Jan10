package Package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) {
        //tell your project where the webdriver is located
     System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
     //create an instance of WebDriver
        WebDriver driver=new ChromeDriver();
     //open the google.com website
     driver.get("https://www.google.com/");
    }
}
