import java.util.ArrayList;

public class SharpieMain {
  public static void main(String[] args) {

    Sharpie sharpie1 = new Sharpie("blue", 1,100);
    Sharpie sharpie2 = new Sharpie("red", 2, 50);
    Sharpie sharpie3 = new Sharpie("green", 1, 25);
    Sharpie sharpie4 = new Sharpie("yellow", 3, 0);
    Sharpie sharpie5 = new Sharpie("black", 1,0);

    sharpie1.use();
    sharpie1.sharpieStatus();

    SharpieSet sharpieList = new SharpieSet();
    sharpieList.addSharpie(sharpie1);
    sharpieList.addSharpie(sharpie2);
    sharpieList.addSharpie(sharpie3);
    sharpieList.addSharpie(sharpie4);
    sharpieList.addSharpie(sharpie5);

    sharpieList.countUsable();
    sharpieList.removeTrash();

  }
}