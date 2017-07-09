package com.eteration;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.eteration.DAO.QuestionDAO;

@SpringBootApplication
public class ApplicationMain {

	
	public static void main(String[] args) {
		SpringApplication.run(ApplicationMain.class, args);
	}
	
//	@Bean
//	public CommandLineRunner runner(QuestionDAO dao)
//	{
//		
//		return null;
//		
//	}
}
