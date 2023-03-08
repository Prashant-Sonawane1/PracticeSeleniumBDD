package com.demo.steps;

import com.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginSteps {

    @Given("user is on website login page")
    public void user_is_on_website_login_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user is on website login page");
        LoginPage.initialize();

    }

    @When("^user enters (.*) and (.*)$")
    public void user_enters_username_and_password(String username, String password) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user enters username and password" + username + password);
        LoginPage.enter_username_password(username, password);

    }

    @And("user clicks on login button")
    public void user_clicks_on_login_button() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user clicks on login button");
        LoginPage.click_login();
    }


    @Then("user is navigated to dashboard page")
    public void user_is_navigated_to_dashboard_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user is navigated to dashboard page");

        Assert.assertEquals(LoginPage.get_wallet_text(),"Wallet Balance");

        LoginPage.driver.close();
        LoginPage.driver.quit();

    }





}
