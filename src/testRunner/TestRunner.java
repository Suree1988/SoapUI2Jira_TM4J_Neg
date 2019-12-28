package testRunner;

import org.junit.runner.RunWith;		
import cucumber.api.CucumberOptions;		
import cucumber.api.junit.Cucumber;		

@RunWith(Cucumber.class)				
@CucumberOptions(features= {"bdd-export1989232709596802405"},
glue= {"stepDefinitions"},
tags= {"@TestCaseKey=TM-T3"},
format= {"junit:target/cucumber/Test-soaui_report.xml","json:target/cucumber/Test-soaui_report.json"})		

public class TestRunner {

}
 