package com.example.in28mins.myfirstwebapp.hello;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ticketServices {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    public ticketServices() {
    	
    }

    public ticketServices(String title, String isbn) {
    	
    }
}
