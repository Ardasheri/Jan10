package Homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1 {
    /*
     * 1. launch the browser
     * 2. navigate to amazon web site
     * 3. print out the title and the url in the console
     * 4. close the browser
     */
    public static void main(String[] args) {
// tell your project where the webdriver is located.
System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
//      create an instance of WebDriver
        WebDriver driver=new ChromeDriver();
//      open the Website facebook.com
        driver.get("https://www.amazon.com/");
//      get the current url that is there in the browser
        String URL = driver.getCurrentUrl();
//      print out the url
        System.out.println(URL);

//      get the title of the webpage
        String title=driver.getTitle();
//      print the title of the page
        System.out.println("the title of the page is "+title);
//      close the browser

        driver.quit();

    }
}
