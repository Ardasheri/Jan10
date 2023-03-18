package Package1;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SeleniumVersionCheck {
    public static void main(String[] args) {
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        System.out.println("Selenium version: " + capabilities.getCapability(CapabilityType.BROWSER_VERSION));
    }
}

