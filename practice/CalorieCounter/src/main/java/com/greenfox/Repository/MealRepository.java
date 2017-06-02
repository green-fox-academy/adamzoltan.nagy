package com.greenfox.Repository;

import com.greenfox.Model.Meal;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Adam on 2017. 06. 02..
 */
public interface MealRepository extends CrudRepository<Meal,Long> {
}
