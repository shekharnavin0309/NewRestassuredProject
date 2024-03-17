package com.testcases;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;

import junit.framework.Test;

public class SampleJUnitTest extends BaseJUnitClass {
	
	@Before
	public void setup() {
		System.out.println("before setup");
	}
	
	@After
	public void cleanup() {
		System.out.println("after setup");
	}
	
	@org.junit.Test
	public void testName1() throws Exception {
		System.out.println("In testName1");
		assertEquals(false, false);
	}
	
	
	@org.junit.Test
	public void testName2() throws Exception {
		System.out.println("In testName2");
		assertEquals(false, false);
	}	


}
