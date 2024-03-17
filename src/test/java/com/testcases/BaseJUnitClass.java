package com.testcases;

import org.junit.AfterClass;
import org.junit.BeforeClass;


public class BaseJUnitClass {
	@BeforeClass
	public static void setupClass() {
		System.out.println("before class");
	}
	
	@AfterClass
	public static void cleanupClass() {
		System.out.println("after class");
	}
}
