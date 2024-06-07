package step_definitions;


import org.junit.runner.RunWith;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
//        tags = "@Checkout",
        features = {"classpath:features"},
        glue = { "classpath:step_definitions"},
        plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","timeline:test-output-thread/"})


public class RunCukesTest extends AbstractTestNGCucumberTests {

}
