package Test_Ng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listner_Demo implements ITestListener

{
	public void onstart(ITestContext c)
	{
		System.out.println("OnStart");
	}
	
	public void onfinish(ITestContext c)
	{
		System.out.println("OnFinish");
	}
	
	public void onteststart(ITestResult c)
	{
		System.out.println("OnTestStart");
	}
	
	public void ontestsuccess(ITestResult c)
	{
		System.out.println("OnTestSucess");
	}
	
	public void ontestfailure(ITestResult c)
	{
		System.out.println("OnTestFinish");
	}
	
	public void ontestskip(ITestResult c)
	{
		System.out.println("OnTestSkip");
	}
	
	public void OnTestfailedButWithinSuccessPercentage(ITestResult c)
	{
		System.out.println("OnTestfailedButWithinSuccessPercentage");
	}

}
