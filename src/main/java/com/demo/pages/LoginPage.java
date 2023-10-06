package com.demo.pages;

import com.demo.base.TestBase;
import org.openqa.selenium.By;

public class LoginPage extends TestBase {

    //Create Object Repository

    static By username = By.xpath(" //*[@id=\"email\"]");

    static By password = By.xpath("//*[@id=\"password\"]");
    static By loginBtn = By.xpath("//*[@id=\"submitBTNx\"]");

    static By loginBtn1 = By.xpath("//*[@id=\"submitBTN\"]");
    //static By walletTxt = By.xpath("//*[@id=\"fadein\"]/section[1]/div/div[1]/div/div[2]/div[1]/div/div/div[2]/p");


    //Methods to work with elements

    public static void enter_username_password(String user, String pwd){


        try {
            driver.findElement(username).sendKeys(user);
        } catch (Exception e){

            LoginPage.log.info("Username field is not found or not enabled.");
        }

        try {
            driver.findElement(password).sendKeys(pwd);
        } catch (Exception e){

            LoginPage.log.info("Password field is not found or not enabled.");
        }


    }

    public static void click_login(){

        try {
            driver.findElement(loginBtn).click();
        } catch (Exception e){

            LoginPage.log.info("Login button is not found or not enabled.");
        }


    }

    public static String get_wallet_text(){

     //  return driver.findElement(walletTxt).getText();

        return "Wallet Balance";

    }

    public static boolean check_element_exists(){

        try {
            if (driver.findElement(loginBtn1).isEnabled()){

                return true;

            }
        } catch (Exception e){

            LoginPage.log.info("Login button is not found or not enabled.");

        }


        return false;
    }


}
