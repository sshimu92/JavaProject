package testNGTutorials;

import org.testng.annotations.Test;

public class FirstTestNGScript {

	@Test(priority = 1, description = "This test case will verify login functionality")
	public void loginApplocation() {
		System.out.println("Hey this is my first test");

	}

	@Test(priority = 2, description = "This test case will add certain items in basket")
	public void selectItems() {
		System.out.println("Item Selected");

	}

	@Test(priority = 3, description = "This test case will perforn checkout operation")
	public void checkOut() {
		System.out.println("Chekout completed");

	}
}