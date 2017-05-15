package com.greenfox.Controller;

import com.greenfox.Model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Adam on 2017. 05. 15..
 */

@RestController
public class GuardianController {


  ShipCargo shipCargo = new ShipCargo();

  @GetMapping("/groot")
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

  @GetMapping("/yondu")
  public Calculation calculate(@RequestParam("distance")String distance,
                               @RequestParam("time") String time) {
    Calculation calculation = new Calculation();
    calculation.setDistance(distance);
    calculation.setTime(time);
    calculation.calculateSpeed();
    return calculation;
  }

  @GetMapping("/rocket")
  public ShipCargo cargoList(){
    return shipCargo;
  }

  @GetMapping("/rocket/fill")
  public FillShip fillShip(@RequestParam("received") String received,
                           @RequestParam("amount")int amount){
    FillShip fillShip = new FillShip(received,amount);
    fillShip.changeStatus();
    fillShip.changeReady();
    return fillShip;
  }
}
