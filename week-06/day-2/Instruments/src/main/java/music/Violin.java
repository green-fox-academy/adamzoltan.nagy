package main.java.music;

/**
 * Created by Adam on 2017. 04. 18..
 */
public class Violin extends StringedInstrument {

  public Violin() {
    name = "Violin";
    sound = "Schreech";
    numberOfStrings = 4;
  }

  @Override
  public void play() {
    System.out.printf(formatForPlay, name, numberOfStrings, sound);
  }
}
