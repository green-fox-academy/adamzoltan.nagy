package com.greenfox;

import com.greenfox.Model.Meal;
import com.greenfox.Repository.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CaloriecounterApplication implements CommandLineRunner{

	@Autowired
	private MealRepository mealRepository;

	public static void main(String[] args) {
		SpringApplication.run(CaloriecounterApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		mealRepository.save(new Meal("pizza", "A yummy pizza", 654.32));
		mealRepository.save(new Meal("pancake", "A yummy pancake", 500));
	}
}
