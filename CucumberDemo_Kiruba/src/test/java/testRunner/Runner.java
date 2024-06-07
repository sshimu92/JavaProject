package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(//tags = "@positive or @negative",
		          features = "classpath:features/checkout.feature",
                  glue = "stepdefinitions")

public class Runner extends AbstractTestNGCucumberTests{

	
	
}
