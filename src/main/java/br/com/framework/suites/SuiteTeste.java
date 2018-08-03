package br.com.framework.suites;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import br.com.framework.core.DriverFactory;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/Features"},
		plugin = { "pretty", "html:target/cucumber/cucumber-pretty", "json:target/cucumber.json"},
		monochrome = true,
		glue = {"br.com.framework.test"}
		)

public class SuiteTeste {
		
	@AfterClass
	public static void finalizaTudo() throws Exception {
		DriverFactory.killDriver();
	}

}
