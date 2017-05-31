package com.greenfox;

import com.greenfox.Model.Todo;
import com.greenfox.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoExampracticeApplication implements CommandLineRunner{

	@Autowired
	private TodoRepository todoRepository;

	public static void main(String[] args) {
		SpringApplication.run(TodoExampracticeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		todoRepository.save(new Todo("Todo"));
		todoRepository.save(new Todo("Todo"));
		todoRepository.save(new Todo("Todo"));
		todoRepository.save(new Todo("Todo"));
	}
}
