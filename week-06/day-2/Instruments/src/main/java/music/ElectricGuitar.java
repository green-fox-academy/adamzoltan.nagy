package main.java.music;

/**
 * Created by Adam on 2017. 04. 18..
 */
public class ElectricGuitar extends StringedInstrument {

  public ElectricGuitar(int numberOfStrings) {
    this.numberOfStrings = numberOfStrings;
  }

  public ElectricGuitar() {
    name = "Electric Guitar";
    sound = "Twang";
    numberOfStrings = 6;
  }

  @Override
  public void play() {
    System.out.printf(formatForPlay, name, numberOfStrings, sound);
  }
}
