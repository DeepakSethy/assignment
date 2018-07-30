package com.assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class AssignmentApiApp {
	public static void main(String[] args){
		SpringApplication.run(AssignmentApiApp.class,args);
	}
}
