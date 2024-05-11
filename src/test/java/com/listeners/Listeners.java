package com.listeners;

import org.testng.ISuite;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

	public void onFinish(ISuite suite) {
		System.out.println("Finishing");
	}

	public void onStart(ISuite suite) {
		System.out.println("Starting");
	}

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		//System.out.println("Successfully executed.........");
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		//System.out.println("Successfully executed.........");
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Un-Successfully executed........." + result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
	}
}
