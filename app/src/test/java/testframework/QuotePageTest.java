package testframework;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class QuotePageTest {

    private QuotePage quotePage;

    @BeforeMethod
    public void setup() {
        WebDriverSetup.initializeDriver();
        WebDriverSetup.driver.get(
                "https://appqoverme-ui.sbx.qover.io/bike/policyholder?key=pk_9153C6B0DDB3C97367AE&locale=en-BE&id=c7f3087e-3761-4933-8931-4aaf0453eead");
        quotePage = new QuotePage(WebDriverSetup.driver);
    }

    @Test
    public void testNameField() {
        quotePage.nameField().sendKeys("John Doe");
        quotePage.phoneField().sendKeys("1234567890");
        quotePage.emailField().sendKeys("john.doe@email.com");
    }

    // @Test
    // public void testEmailField() {
    // quotePage.emailField().sendKeys("john.doe@email.com");
    // }
    // @Test
    // public void testPhoneField() {
    // quotePage.phoneField().sendKeys("1234567890");
    // }

    // similar test cases for the other fields on the quote page

    @AfterMethod
    public void tearDown() {
        WebDriverSetup.quitDriver();
    }
}
