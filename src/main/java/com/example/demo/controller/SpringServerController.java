package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Test;

@RestController
public class SpringServerController {
	
	@Autowired
	private Test test;
	
	@RequestMapping(value="test")
	public String returnTest(){
		return test.getTest()+" Ankit";
	}
	
}