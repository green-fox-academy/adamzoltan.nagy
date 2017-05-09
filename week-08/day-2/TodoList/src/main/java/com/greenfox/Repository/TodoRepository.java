package com.greenfox.Repository;

import com.greenfox.Model.Todo;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Adam on 2017. 05. 09..
 */
public interface TodoRepository extends CrudRepository <Todo, Long>{
}
