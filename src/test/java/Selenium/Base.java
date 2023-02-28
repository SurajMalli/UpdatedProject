package Selenium;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
    public static WebDriver driver;

    @Before
    public static void Setup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/Driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
    }

    @After
    public static void tearDown() {
        driver.close();
        driver.quit();
    }
}
