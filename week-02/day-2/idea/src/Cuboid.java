/**
 * Created by Adam on 2017. 03. 21..
 */
public class Cuboid {
  public static void main(String[] args) {
    double a = 10;
    double b = 20;
    double c = 30;
    double surface = (a * b + a * c + b * c) * 2;
    double volume = a * b *c;

    System.out.println("Surface Area: "+ (int)surface );
    System.out.println("Volume: " + (int) volume );

  }

}
