package com.example.in28mins.myfirstwebapp.login;

import javax.naming.ldap.PagedResultsResponseControl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class loginController {
	
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String loginCall() {
		return "login";
	}
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String goToWelcome(@RequestParam String name,@RequestParam String password,ModelMap mm) {
		String correctId="myid",correctPass="mypass";
		if(correctId.equals(name) && correctPass.equals(password))
		{
		mm.put("name",name);
		mm.put("password",password);
		return "welcome";
		}
		else {
			mm.put("error", "Invalid Credentials");
			return "login";
		}
	}
}
