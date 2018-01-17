package com.example.harj1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HarjoitusApp {
	@RequestMapping("/index")
	public String mainHello() {
		return "This is the main page";
	}
	
	@RequestMapping("/contact")
	public String contactHello() {
		return "This is the contact page";
	}
	
	@RequestMapping("/hello")
	public String helloHello(@RequestParam(name="firstname", required=false, defaultValue="nimi")String firstName, @RequestParam(name="location", required=false, defaultValue="Moon")String location) {
		return "Welcome to the "+location+" "+firstName+"!";
	}
}
