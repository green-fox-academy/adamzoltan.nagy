package com.greenfox.Repository;

import com.greenfox.Model.Note;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Adam on 2017. 05. 13..
 */
public interface NoteRepository extends CrudRepository<Note,Long> {
}
