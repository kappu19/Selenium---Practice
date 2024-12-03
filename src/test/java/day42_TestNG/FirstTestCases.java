package day42_TestNG;

import org.testng.annotations.Test;

/*
1) open app
2)login app
3) logout app
*/

// priority sequence : -5,-4,-3,-2,-1,0,1,2,3,4,5

public class FirstTestCases {

	@Test(priority = 1)
	void openapp() {
		System.out.println("opening application....");
	}

	@Test(priority = 2)
	void login() {
		System.out.println("login to applications.....");
	}

	@Test(priority = 3)
	void logout() {
		System.out.println("logout from application....");
	}

}
