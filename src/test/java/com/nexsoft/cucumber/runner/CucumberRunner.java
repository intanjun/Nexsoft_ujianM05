package com.nexsoft.cucumber.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags ="",
				features ={"src/test/resources/OneList.feature"},
				glue = "com.nexsoft.cucumber.definition")
public class CucumberRunner extends AbstractTestNGCucumberTests {
//"src/test/resources/NewContact.feature",
}
