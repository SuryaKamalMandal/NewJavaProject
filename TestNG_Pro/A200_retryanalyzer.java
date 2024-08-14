package TestNG_Pro;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class A200_retryanalyzer implements IRetryAnalyzer{
	
	int current_count=0;
	int retry_count=2;
	@Override
	public boolean retry(ITestResult result) {
		
		if(current_count<retry_count) {
			current_count++;
			return true;	
		}	
		return false;
	}
}