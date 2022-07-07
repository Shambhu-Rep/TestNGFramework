package org.anotat;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.retry.RetryFailed;
import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;
public class IAnotation implements IAnnotationTransformer {
	public void transform(ITestAnnotation arg0, Class arg1, Constructor arg2, Method arg3) {
		IRetryAnalyzer analyzer = arg0.getRetryAnalyzerClass();
		if (analyzer==null) {
			arg0.setRetryAnalyzer(RetryFailed.class);
		}}}

