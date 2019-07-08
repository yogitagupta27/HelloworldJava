package com.javainterviewpoint.my_helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Hello world!
 *
 */
@RestController
@EnableAutoConfiguration

public class App 
{
	@RequestMapping("/")
    String hello() {
        return "Hello World!";
    }
	
	public static void main(String[] args) throws Exception {
        SpringApplication.run(App.class, args);
    }
}
