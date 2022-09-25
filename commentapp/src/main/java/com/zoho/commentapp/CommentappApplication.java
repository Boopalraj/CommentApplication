package com.zoho.commentapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "com.zoho.commentapp" })
public class CommentappApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommentappApplication.class, args);
	}

}
