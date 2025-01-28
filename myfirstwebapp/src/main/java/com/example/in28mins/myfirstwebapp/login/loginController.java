package com.example.in28mins.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class loginController {
	@RequestMapping("login")
	public String loginCall(@RequestParam String name,ModelMap mp) {
		mp.put("currname", name);
		return "login";
	}
}
