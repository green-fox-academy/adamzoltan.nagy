package com.greenfox.Controller;

import com.greenfox.Modell.Doubling;
import com.greenfox.Modell.ErrorMessage;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

/**
 * Created by Adam on 2017. 05. 10..
 */
@RestController
public class DoublingController {


  @GetMapping(value = "/doubling")
  public static Doubling doubling(@RequestParam("recieved") int recieved) {
    Doubling doubling = new Doubling();
    doubling.setRecieved(recieved);
    doubling.setResult(recieved*2);
    return doubling;
  }

  @ExceptionHandler(MethodArgumentTypeMismatchException.class)
  public ErrorMessage message() {
    return new ErrorMessage("Please provide an input!");
  }
}
