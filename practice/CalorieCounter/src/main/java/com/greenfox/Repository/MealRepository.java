package com.greenfox.Repository;

import com.greenfox.Model.Meal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Adam on 2017. 06. 02..
 */
@Repository
public interface MealRepository extends CrudRepository<Meal,Long> {
}
