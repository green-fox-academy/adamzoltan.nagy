/**
 * Created by Adam on 2017. 04. 16..
 */
public class Zoo {
  public static void main(String[] args) {

    Reptile reptile = new Reptile("Crocodile", 5, "male", 20);
    Mammal mammal = new Mammal("Koala",2, "female", 10);
    Bird bird = new Bird("Parrot", 3, "male", 1);

    System.out.println("Who want a baby?");
    System.out.println(reptile.getName() +  "," + reptile.wantChild());
    System.out.println(mammal.getName() + "," + mammal.wantChild());
    System.out.println(bird.getName() + "," + bird.wantChild());
  }
}
