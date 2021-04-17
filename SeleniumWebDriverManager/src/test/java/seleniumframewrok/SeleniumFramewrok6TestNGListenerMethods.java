package seleniumframewrok;

import org.testng.*;

public class SeleniumFramewrok6TestNGListenerMethods implements ITestListener{

	/*6th Automation TestNGListener Code Ends Here*/

//	Invoked after all the tests have run and all their Configuration methods have been called.
	public void onFinish(ITestContext context) {
		System.out.println("onFinish "+context.getName());
	}
//	Invoked after the test class is instantiated and before any configuration method is called.
	public void onStart(ITestContext context) {
		System.out.println("onStart "+context.getName());
	}
//	Invoked each time a method fails but has been annotated with successPercentage and this failure still keeps it within the success percentage requested.
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("onTestFailedButWithinSuccessPercentage "+result.getName());
	}
//	Invoked each time a test fails.
	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure "+result.getName());
	}
//	Invoked each time a test is skipped.
	public void onTestSkipped(ITestResult result) {
		System.out.println("onTestSkipped "+result.getName());
	}
//	Invoked each time before a test will be invoked.
	public void onTestStart(ITestResult result) {
		System.out.println("onTestStart "+result.getName());
	}
//	Invoked each time a test succeeds.
	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess "+result.getName());
	}

	/*6th Automation TestNGListener Code Ends Here*/

}