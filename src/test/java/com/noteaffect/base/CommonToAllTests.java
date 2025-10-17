package com.noteaffect.base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.noteaffect.driver.DriverManager;

public class CommonToAllTests {

	@BeforeMethod
	public void setup() {
		DriverManager.init();
	}
	
	@AfterMethod
	public void tearDown() {
		DriverManager.down();
	}
}
