package Package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.com/");

        String url=driver.getCurrentUrl();

        System.out.println(url);

        String title=driver.getTitle();

        System.out.println(title);


    }
}
