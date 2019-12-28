package stepDefinitions;

import com.eviware.soapui.tools.SoapUITestCaseRunner;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;

public class mySoapUITestNegTest {
	
	@Given("^SoapUI negative test case$")
	public void soapui_negative_test_case() throws Throwable {
		
		 SoapUITestCaseRunner runner = new SoapUITestCaseRunner(); 
		  runner.setProjectFile( "SoapUI_File/Calculator-soapui-project.xml" );
		  runner.run(); 
		  
	    throw new PendingException();
	}

}
