package Data_Display;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNG_Listener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test started "+result.getName());
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test onTestSuccess "+result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test onTestFailure "+result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Test onTestFailedButWithinSuccessPercentage "+result.getName());
		
	}

	@Override
	public void onStart(ITestContext result) {
		System.out.println("Test onStart "+result.getName());
		
	}

	@Override
	public void onFinish(ITestContext result) {
		System.out.println("Test onFinish "+result.getName());
		
	}

}
