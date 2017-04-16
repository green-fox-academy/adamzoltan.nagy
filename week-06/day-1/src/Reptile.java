/**
 * Created by Adam on 2017. 04. 16..
 */
public class Reptile extends Animal {
  public Reptile (String name, int age, String gender, int weight) {
    super(name, age, gender,weight);
  }

  @Override
  public void greet() {
    System.out.println(" greets you!");
  }

  @Override
  public void wantChild() {
    System.out.println(" want a child from an egg!");
  }

  @Override
  public void eat() {
    System.out.println(" is eating.");
  }

  @Override
  public void move() {
    System.out.println(" is crawling.");
  }
}
