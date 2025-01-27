package com.example.in28mins.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class loginController {
	
	@RequestMapping("login")
	public String loginCall() {
		return "login";
	}
}
