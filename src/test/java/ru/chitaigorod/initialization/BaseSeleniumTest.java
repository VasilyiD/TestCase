package ru.chitaigorod.initialization;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.chitaigorod.initialization.BaseSeleniumPage;
import ru.chitaigorod.models.MainPage;
import ru.chitaigorod.models.ShoppingCartPage;

import java.util.concurrent.TimeUnit;

abstract public class BaseSeleniumTest {

    protected WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        BaseSeleniumPage.setDriver(driver);
    }

    @After
    public void tearDown() {
        driver.close();
        driver.quit();
    }
}