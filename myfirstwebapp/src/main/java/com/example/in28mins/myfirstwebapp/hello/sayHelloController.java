package com.example.in28mins.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class sayHelloController {
	
	@RequestMapping("/hello")
	@ResponseBody
	String sayHi()
	{
		return "Hello! What are you learning today";
	}
	
	@RequestMapping("/html")
	@ResponseBody
	String showhtml()
	{
		String s=
				""" 
				<html>
					<head>
						<title>My first html title</title>
					</head>
					<body>
						My first html body
					</body>
				</html>
				""";
		return s;
	}
	
	
}
