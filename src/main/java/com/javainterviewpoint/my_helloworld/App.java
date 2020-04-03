package com.javainterviewpoint.my_helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
@EnableAutoConfiguration
@EnableWebSecurity
@SpringBootApplication
public class App 
{
	@GetMapping("/")
    String hello() {
    
    return " ENTER CORRECT USERNAME AND PASSWORD TO LOGIN....!";
    
    }
	
	public static void main(String[] args) throws Exception {
        SpringApplication.run(App.class, args);
    }
}
