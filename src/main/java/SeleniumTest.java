import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    private WebDriver driver;

    @Before
    public void startsSelenium() {
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
    }

    @After
    public void endsSelenium() {
        driver.quit();
    }

    @Test
    public void testsGoogle() {
        System.out.println(driver.getTitle());
        Assert.assertEquals("Google", driver.getTitle());
    }
}