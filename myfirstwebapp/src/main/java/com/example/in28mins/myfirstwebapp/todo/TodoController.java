package com.example.in28mins.myfirstwebapp.todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class TodoController {

	@Autowired
	todoService obj;
	
	@RequestMapping("/todo")
	public String showList(ModelMap model)
	{
		List<Todo> yourTodo=obj.getList();
		model.addAttribute("yourTodo",yourTodo);
		return "todoJsp";
	}
}
