package com.example.demo;

import java.util.logging.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsTestApplication {
	
	public static org.slf4j.Logger logger= LoggerFactory.getLogger(JenkinsTestApplication.class);
	
	public void init()
	{
		logger.info("Appliucation Started");
	}

	public static void main(String[] args) {
		
		logger.info("Appliucation Executed");
		SpringApplication.run(JenkinsTestApplication.class, args);
	}

}
