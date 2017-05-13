package com.greenfox;

import com.greenfox.Model.Note;
import com.greenfox.Repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WeekendTodoApplication  {



	public static void main(String[] args) {
		SpringApplication.run(WeekendTodoApplication.class, args);
	}


}
