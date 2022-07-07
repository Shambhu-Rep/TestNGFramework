package all.anatation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationOrder {
@BeforeSuite
private void beforeSuiteTest() {
	System.out.println("BeforeSuite");

}
@AfterSuite
private void afterSuiteTest() {
	System.out.println("AfterSuite");

}
@BeforeClass
private void beforeClassTest() {
	System.out.println("BeforeClass");

}
@AfterClass
private void afterClassTest() {
	System.out.println("AfterClass");

}
@BeforeTest
private void beforeTestTest() {
	System.out.println("BeforeTest");

}
@AfterTest
private void afterTestTest() {
	System.out.println("AfterTest");

}
@BeforeMethod
private void beforeMethodTest() {
	System.out.println("BeforeMethod");

}
@AfterMethod
private void afterMethodTest() {
	System.out.println("AfterMethod");

}
@Test
private void test() {
	System.out.println("Test");

}
}
