package com.grupodot.test.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Dto {
	
	@JsonProperty("word")
	private String word; 
	
	
}
