/**
 * Created by Adam on 2017. 03. 23..
 */
import java.util.ArrayList;
public class exr04CandyShop {
  public static void main(String[] args) {
    ArrayList<Object> arrayList = new ArrayList<Object>();
    arrayList.add("Cupcake");
    arrayList.add(2);
    arrayList.add("Brownie");
    arrayList.add(false);

    for (int i = 0; i<arrayList.size(); i++) {
      if (i == 1) {
        arrayList.set(i,"Croissant");
      } else if (i == 3) {
        arrayList.set(i,"Ice Cream");
      }
    }

    System.out.println(arrayList);
  }
}
