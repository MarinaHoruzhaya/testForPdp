package seleniumTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.UUID;

public class BaseTest {
    protected WebDriver driver;

    @BeforeEach
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--user-data-dir=" + System.getProperty("java.io.tmpdir") + "/chrome-profile-" + UUID.randomUUID());
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        //options.addArguments("--headless=new"); // для запуска в headless-режиме
        options.addArguments("--remote-allow-origins=*"); // для совместимости

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.get("https://www.selenium.dev/");
    }

    @AfterEach
    public void tearDown(){
        driver.quit();
    }
}
