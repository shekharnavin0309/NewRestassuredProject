package com.testcases;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.*;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.basetype.BaseTest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.readjson.ReadJsonFile;

import io.restassured.response.Response;

public class GetApiTest extends BaseTest {
	
	int count = 0;
	
	@Test(dataProvider = "getData")	
	public void validateCustomerInfo(String expectedName, String expectedEmail) throws JsonMappingException, JsonProcessingException {
		Response res = given().auth().basic(config.getProperty("secretKey"), "")
				.get(config.getProperty("customerEndPoint"));

		ReadJsonFile reader = new ReadJsonFile();
		JsonNode node = reader.readJson(res.asPrettyString());
		System.out.println(res.asPrettyString());
		
		String actulaName = node.get("data").get(count).get("name").asText();
		String actualEmail = node.get("data").get(count).get("email").asText();
		assertEquals(expectedName, actulaName);
		assertEquals(expectedEmail, actualEmail);
		count++;
	}
		
	
	@DataProvider
	
	public Object[][] getData(){
		return new Object[][] {
			{"Neha","neha@example.com"},
			{"jyothi","jyothi@gmail.com"}
		};
	}	
}
