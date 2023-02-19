package GroupProject_3;

public class Task_4 {public interface WebDriver {
    void open();
    void close();
    String getTitle();
}

    public interface TakesScreenshot {
        void getScreenshot();
    }

    public interface RemoteWebDriver extends WebDriver {
        void navigate();
    }

    public class ChromeDriver implements RemoteWebDriver, TakesScreenshot {
        public void open() {
            System.out.println("ChromeDriver: Opened");
        }

        public void close() {
            System.out.println("ChromeDriver: Closed");
        }

        public String getTitle() {
            return "ChromeDriver: Title";
        }

        public void navigate() {
            System.out.println("ChromeDriver: Navigating");
        }

        public void getScreenshot() {
            System.out.println("ChromeDriver: Getting Screenshot");
        }
    }

    public class FirefoxDriver implements RemoteWebDriver, TakesScreenshot {
        public void open() {
            System.out.println("FirefoxDriver: Opened");
        }

        public void close() {
            System.out.println("FirefoxDriver: Closed");
        }

        public String getTitle() {
            return "FirefoxDriver: Title";
        }

        public void navigate() {
            System.out.println("FirefoxDriver: Navigating");
        }

        public void getScreenshot() {
            System.out.println("FirefoxDriver: Getting Screenshot");
        }
    }

    public class SafariDriver implements RemoteWebDriver, TakesScreenshot {
        public void open() {
            System.out.println("SafariDriver: Opened");
        }

        public void close() {
            System.out.println("SafariDriver: Closed");
        }

        public String getTitle() {
            return "SafariDriver: Title";
        }

        public void navigate() {
            System.out.println("SafariDriver: Navigating");
        }

        public void getScreenshot() {
            System.out.println("SafariDriver: Getting Screenshot");
        }
    }

    public class Test {
        public static void main(String[] args) {
            RemoteWebDriver chromeDriver = new ChromeDriver();
            chromeDriver.open();
            chromeDriver.navigate();
            ((ChromeDriver) chromeDriver).getScreenshot();
            chromeDriver.close();

            RemoteWebDriver firefoxDriver = new FirefoxDriver();
            firefoxDriver.open();
            firefoxDriver.navigate();
            ((FirefoxDriver) firefoxDriver).getScreenshot();
            firefoxDriver.close();

            RemoteWebDriver safariDriver = new SafariDriver();
            safariDriver.open();
            safariDriver.navigate();
            ((SafariDriver) safariDriver).getScreenshot();
            safariDriver.close();
        }
    }

}
