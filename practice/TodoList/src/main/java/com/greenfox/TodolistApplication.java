package com.greenfox;

import com.greenfox.Model.Todo;
import com.greenfox.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodolistApplication implements CommandLineRunner {

	@Autowired
	TodoRepository todoRepository;

	public static void main (String[] args) {
		SpringApplication.run(TodolistApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		todoRepository.save(new Todo(1,"I have to learn Object Relational Mapping"));
	}
}
