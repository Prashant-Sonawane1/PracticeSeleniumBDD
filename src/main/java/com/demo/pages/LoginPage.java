package com.demo.pages;

import com.demo.base.TestBase;
import org.openqa.selenium.By;

public class LoginPage extends TestBase {

    //Create Object Repository

    static By username = By.xpath("//*[@id=\"fadein\"]/div[4]/div/div[2]/div[2]/div/form/div[1]/div/input");
    static By password = By.xpath("//*[@id=\"fadein\"]/div[4]/div/div[2]/div[2]/div/form/div[2]/div[1]/input");
    static By loginBtn = By.xpath("//*[@id=\"fadein\"]/div[4]/div/div[2]/div[2]/div/form/div[3]/button");
    static By walletTxt = By.xpath("//*[@id=\"fadein\"]/section[1]/div/div[1]/div/div[2]/div[1]/div/div/div[2]/p");


    //Methods to work with elements

    public static void enter_username_password(String user, String pwd){

        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pwd);

    }

    public static void click_login(){

        driver.findElement(loginBtn).click();

    }

    public static String get_wallet_text(){

       return driver.findElement(walletTxt).getText();

    }


}
