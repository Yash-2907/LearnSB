package com.example.in28mins.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class todoService {
    private static List<Todo> tasksList=new ArrayList<Todo>();
    static {
    	tasksList.add(new Todo(0,"yash","learn this course",LocalDate.now(),true));
    	tasksList.add(new Todo(1,"yash","do dsa",LocalDate.now().plusYears(1),false));
    	tasksList.add(new Todo(2,"yash","get placed",LocalDate.now().plusYears(2),false));
    	tasksList.add(new Todo(3,"yash","learn more",LocalDate.now().plusYears(3),false));
    }
    
    public List<Todo> getList()
    {
    	return tasksList;
    }
    
}
