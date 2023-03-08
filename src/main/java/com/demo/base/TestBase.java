package com.demo.base;

//TestBase Class for Page Object Model

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestBase {

    public static WebDriver driver;

    public static void initialize(){

        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(chromeOptions);

        driver.manage().window().maximize();

        driver.get("https://phptravels.net/login");

    }

}
