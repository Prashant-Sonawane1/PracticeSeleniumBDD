package com.demo.steps;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/login.feature",
glue = {"com.demo.steps"},
        monochrome = true,
        //plugin = {"pretty","html:target/CucumberReports.html"}
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

)

public class TestRunner {



}
