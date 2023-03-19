package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Calendar {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.delta.com/");
                driver.manage().window().maximize();

        WebElement calendar = driver.findElement(By.xpath("//span[text()='Depart']"));
        calendar.click();

        //get the month from the Calendar
        WebElement month= driver.findElement(By.xpath("//span[contains(@class,'datepicker-month')]"));
        //get the next button
        WebElement next= driver.findElement(By.xpath("//span[text()='Next']"));
        //click on next button until you find the right month
        boolean isFound=false;
        while (!isFound){
            String month123 = month.getText();
            if (month123.equalsIgnoreCase("January")){
                //select the date
                List<WebElement> days=driver.findElements(By.xpath("//table[@class='dl-datepicker-calendar']/tbody/tr/td"));
                for (WebElement day : days) {
                    String day_text= day.getText();
                    if (day_text.equalsIgnoreCase("20")){
                        day.click();
                        isFound=true;
                        break;
                    }
                }

            }else{
                next.click();
            }
        }
    }}