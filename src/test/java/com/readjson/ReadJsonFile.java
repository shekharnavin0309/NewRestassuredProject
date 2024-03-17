package com.readjson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadJsonFile {
	ObjectMapper mapper;
	
	public ReadJsonFile() {
		mapper = new ObjectMapper();;
	}
	
	public JsonNode readJson(String response) throws JsonMappingException, JsonProcessingException {
		return  mapper.readTree(response);
	}
}
