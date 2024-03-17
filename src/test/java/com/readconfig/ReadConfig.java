package com.readconfig;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	
	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources");
		prop.load(fis);
		
		String baseUrl = prop.getProperty("baseURL");
		String basePath = prop.getProperty("basePath");
		
	}

}
