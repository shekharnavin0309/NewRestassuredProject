package com.basetype;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.utilities.ExcelReader;

import io.restassured.RestAssured;

public class BaseTest {
	
	public static Properties config = new Properties();
	public static ExcelReader excel = new ExcelReader(".\\src\\test\\resources\\excel\\testdata.xlsx");
		
	@BeforeTest
	public void setup() {
		readPropertyFile();
		RestAssured.baseURI = config.getProperty("baseURL");
		RestAssured.basePath = config.getProperty("basePath");;
	}
	
	public void readPropertyFile() {
		FileInputStream fis;
		
		try {
			fis = new FileInputStream(".\\src\\test\\resources\\config.properties");
			config.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	
	@AfterTest
	public void tearDown() {
		
	}
	
	

}
