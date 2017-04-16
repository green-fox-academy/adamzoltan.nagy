import javax.sound.midi.Soundbank;

/**
 * Created by Adam on 2017. 04. 16..
 */
public class Mammal extends Animal {

  public Mammal(String name, int age, String gender, int weight) {
    super(name, age, gender,weight);
  }

  @Override
  public void greet() {
    System.out.println(" greets you!");
  }

  @Override
  public String wantChild() {
   return " want a child from uterus!";
  }

  @Override
  public void eat() {
    System.out.println(" is eating.");
  }

  @Override
  public void move() {
    System.out.println(" is walking.");
  }

}
