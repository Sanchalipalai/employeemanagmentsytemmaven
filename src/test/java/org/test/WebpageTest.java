package org.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class WebpageTest {WebDriver driver;

    @BeforeTest
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://sanchalipalai.github.io/LABSCERARIO1/");
    }

    @Test
    public void titleValidationTest() {
        String title = driver.getTitle();

        Assert.assertEquals(title, " Employee mamagment system");
    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}