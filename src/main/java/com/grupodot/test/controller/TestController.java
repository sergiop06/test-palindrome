package com.grupodot.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.grupodot.test.model.Dto;
import com.grupodot.test.model.DtoOut;
import com.grupodot.test.service.PalindromoService;

@RestController
public class TestController {
	
	@Autowired
	PalindromoService palindromeService;
	
	@GetMapping("/")
	public String mainPage(){
		return "Hello from test service";
	};
	
	@PostMapping(value = "/palindromo", consumes = "application/json", produces = "application/json")
	@ResponseBody
	public DtoOut longestPalindrome(@RequestBody Dto dto ) {
		
		return palindromeService.palindromo(dto);
				
	}
	
}
