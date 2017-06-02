package com.greenfox;

import com.greenfox.Model.Meal;
import com.greenfox.Model.MealType;
import com.greenfox.Repository.MealRepository;
import com.greenfox.Repository.MealTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CaloriecounterApplication implements CommandLineRunner{

	@Autowired
	private MealRepository mealRepository;
	@Autowired
	private MealTypeRepository mealTypeRepositoryRepository;

	public static void main(String[] args) {
		SpringApplication.run(CaloriecounterApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		mealRepository.save(new Meal("Lunch", "A yummy pizza", 654.32));
		mealRepository.save(new Meal("Dessert", "A yummy pancake", 500));
		mealTypeRepositoryRepository.save(new MealType("Breakfast"));
		mealTypeRepositoryRepository.save(new MealType("Elevenses"));
		mealTypeRepositoryRepository.save(new MealType("Lunch"));
		mealTypeRepositoryRepository.save(new MealType("Snack"));
		mealTypeRepositoryRepository.save(new MealType("Dinner"));
		mealTypeRepositoryRepository.save(new MealType("Midnight Snack"));
	}
}
