package stepdefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Features",glue={"stepdefinitions"},stepNotifications=true,
monochrome=true,
plugin= {"pretty","html:target/HTMLReports.html","json:json/jsonreprt.json","junit:junit/junitreport.xml"})
public class TestRunner {

}
