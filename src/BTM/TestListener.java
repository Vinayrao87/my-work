package BTM;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class TestListener implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("onTestStart",true);
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("testis passed and screenshot taken",true);
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("testis failed and screenshot taken",true);
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("on test skipped",true);
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log("onStart",true);
		
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("onFinish",true);
		
	}
	

}
