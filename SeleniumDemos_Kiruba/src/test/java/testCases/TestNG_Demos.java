package testCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNG_Demos extends Setup {

	// TestNG is an framework for writing test cases like JUNIT(framework for
	// writing test cases in java).
	// TestNG is an annotation based framework.
	// @Test annotation is used to mark a method as a test case.

	@Test(priority=1, groups= "Regression")
	public void test() {

		System.out.println("TestCase1");
	}

	//@Ignore
	@Test(groups = "Smoke")  //(dependsOnMethods="test")
	public void test1() {

		System.out.println("TestCase2");
	}

	@Test(groups = "Smoke")   //(dependsOnMethods="test1")
	public void abc() {

		System.out.println("TestCase3");
	}

}