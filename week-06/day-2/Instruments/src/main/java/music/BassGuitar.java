package main.java.music;

/**
 * Created by Adam on 2017. 04. 18..
 */
public class BassGuitar extends StringedInstrument {

  public BassGuitar(int numberOfStrings) {
    this.numberOfStrings = numberOfStrings;
  }

  public BassGuitar() {
    name = "Bass Guitar";
    sound = "Duum-duum-duum";
    numberOfStrings = 4;
  }

  @Override
  public void play() {
    System.out.printf(formatForPlay, name, numberOfStrings, sound);
  }
}
