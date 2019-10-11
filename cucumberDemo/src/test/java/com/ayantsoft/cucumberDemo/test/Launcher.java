package com.ayantsoft.cucumberDemo.test;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/com/ayantsoft/cucumberDemo/feature/",
		glue="src/test/java/com/ayantsoft/cucumberDemo/test/",
		plugin = {"html:target/cucumber-html-report"},
		monochrome = true)
public class Launcher {

}
