package testframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSetup {

    public static WebDriver driver;

    public static void initializeDriver() {
        System.setProperty("webdriver.chrome.driver",
                "C:/Users/Kuttappan/Downloads/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public static void quitDriver() {
        driver.quit();
    }
}
