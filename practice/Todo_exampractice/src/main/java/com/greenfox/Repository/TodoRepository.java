package com.greenfox.Repository;

import com.greenfox.Model.Todo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Adam on 2017. 05. 31..
 */
public interface TodoRepository extends CrudRepository<Todo, Long> {
  public List<Todo> findAllByDoneTrue();
}
