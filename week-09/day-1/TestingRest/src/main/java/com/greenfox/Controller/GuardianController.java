package com.greenfox.Controller;

import com.greenfox.Model.ErrorMessage;
import com.greenfox.Model.OutputMessage;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Adam on 2017. 05. 15..
 */

@RestController
public class GuardianController {

  @GetMapping ("/groot")
  public OutputMessage translate(@RequestParam("message") String message) {
  OutputMessage outputMessage = new OutputMessage();
  outputMessage.setRecieved(message);
  return outputMessage;
  }

  @ExceptionHandler(Exception.class)
  @ResponseStatus(code = HttpStatus.I_AM_A_TEAPOT)
  public ErrorMessage errorMessage() {
    return new ErrorMessage("I am Groot!");
  }
}
