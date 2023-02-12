package testframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class QuotePage {

    private WebDriver driver;

    public QuotePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement nameField() {
        return driver.findElement(By.id("policyholder.firstName"));
    }

    public WebElement emailField() {
        return driver.findElement(By.id("policyholder.email"));
    }

    public WebElement phoneField() {
        return driver.findElement(By.id("policyholder.phone"));
    }

    // similar methods for the other fields on the quote page
}
