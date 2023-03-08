package com.demo.steps;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:/My Projects/PracticeSeleniumBDD/src/test/resources/login.feature",
glue = {"com.demo.steps"},
        monochrome = true,
        plugin = {"pretty","html:target/CucumberReports.html"}

)

public class TestRunner {



}
