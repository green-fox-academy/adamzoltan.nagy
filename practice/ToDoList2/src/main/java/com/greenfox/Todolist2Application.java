package com.greenfox;

import com.greenfox.Model.Todo;
import com.greenfox.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Todolist2Application implements CommandLineRunner {

	@Autowired
	TodoRepository todoRepository;

	public static void main (String[] args) {
		SpringApplication.run(Todolist2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		todoRepository.save(new Todo("Wake up!", false, true));
		todoRepository.save(new Todo("Have breakfast", false, true));
		todoRepository.save(new Todo("Understand Java", true, false));
		todoRepository.save(new Todo("Have a beer", true, false));
		todoRepository.save(new Todo("Sleep"));
	}
}

