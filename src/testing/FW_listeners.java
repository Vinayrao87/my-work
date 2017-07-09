package testing;

import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class FW_listeners implements ITestListener,Constant_values{
	
	public Logger log=Logger.getLogger(getClass());
	
	@Override
	public void onTestFailure(ITestResult result) {
		
		String filename=AutoUtility1.now();
		String photopath=SCREENSHOT_PATH+filename+".png";
		
		AutoUtility1.getScreenShot(photopath);
		log.info("Screenshot taken:"+photopath);
//		Reporter.log("screenshot taken"+photopath,true);
	}
	
	
	
	
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
	
		
	}

}
