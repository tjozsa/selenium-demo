package org.seleniumdemo.common;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static io.github.bonigarcia.wdm.DriverManagerType.CHROME;
import static io.github.bonigarcia.wdm.DriverManagerType.FIREFOX;

class BrowserFactory {
    static WebDriver getBrowser(String browserName) {
        WebDriver driver;
        if (browserName != null && browserName.equals("chrome")) {
            ChromeDriverManager.getInstance(CHROME).setup();
            driver = new ChromeDriver();
        } else {
            FirefoxDriverManager.getInstance(FIREFOX).setup();
            driver = new FirefoxDriver();
        }
        return driver;
    }
}

