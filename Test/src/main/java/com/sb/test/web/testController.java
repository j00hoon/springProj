package com.sb.test.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class testController 
{	
	@RequestMapping(value="/basic", method=RequestMethod.GET)
	public String sayHello()
	{
		return "<h1>Hello Test~~</h1>";
	}
	 
	@RequestMapping(value="/proper", method=RequestMethod.GET)
	public String sayProperHello()
	{
		return "<h1>Proper Hello Test~~ How are you ~~ </h1>";
	}
	
	@RequestMapping(value="/user_entry", method=RequestMethod.GET)
	public String userForm()
	{
		return "<form action=\"/greeting/user_greeting\" method=\"GET\">\r\n"
		+ "  <label for=\"fname\">First name:</label><br>\r\n"
		+ "  <input type=\"text\" id=\"fname\" name=\"fname\" value=\"\"><br>\r\n"
		+ "  <label for=\"lname\">Last name:</label><br>\r\n"
		+ "  <input type=\"text\" id=\"lname\" name=\"lname\" value=\"\"><br><br>\r\n"
		+ "  <input type=\"submit\" value=\"Submit\">\r\n"
		+ "</form> ";
	}
	
	@RequestMapping(value="/user_greeting", method=RequestMethod.GET)
	public String printUserGreeting(@RequestParam String fname, @RequestParam String lname)
	{
		return "Hello " + fname + " , " + lname;
	}
	
	@RequestMapping(value="/orders/{id}", method=RequestMethod.GET)
	public String getOrder(@PathVariable String id)
	{
		return "Order ID : " + id;
	}
	
}
