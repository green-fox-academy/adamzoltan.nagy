/**
 * Created by Adam on 2017. 04. 16..
 */
public abstract class Animal {
  String name;
  int age;
  String gender;
  int weight;

  public Animal(String name, int age, String gender, int weight) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.weight = weight;
  }

  public abstract void greet();
  public abstract String wantChild();
  public abstract void eat();
  public abstract void move();

  public String getName() {
    return name;
  }

}
