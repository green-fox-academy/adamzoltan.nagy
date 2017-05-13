package com.greenfox.Controller;

import com.greenfox.Model.Note;
import com.greenfox.Repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Adam on 2017. 05. 13..
 */
@Controller
public class MainController {

  @Autowired
  NoteRepository noteRepository;

  @RequestMapping("/index")
  public String index(Model model) {
    model.addAttribute("notes",noteRepository.findAll());
    return "index";
  }

  @RequestMapping("/addNote")
  public String addNote(Model model, @RequestParam(name = "description", required = false) String text ) {
    if (text.length()>0) {
      noteRepository.save(new Note(text));
    }
    return "redirect:/index";
  }

  @RequestMapping("/deleteNote/{id}")
  public String deleteNote(Model model, @PathVariable("id") long id) {
    noteRepository.delete(id);
    return "redirect:/index";
  }

  @RequestMapping("/updateNote/{id}")
  public String updateNote(Model model, @PathVariable("id") long id) {
    model.addAttribute("currentId", id);
    return "update_note";
  }

  @RequestMapping("/changeText/{id}")
  public String changeText (Model model, @PathVariable("id") long id, @RequestParam(name = "newText")String text) {
    Note note = noteRepository.findOne(id);
    note.setText(text);
    noteRepository.delete(id);
    noteRepository.save(note);
    model.addAttribute("notes", noteRepository.findAll());
    return "redirect:/index";
  }
}
