import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Adam on 2017. 04. 19..
 */
public class Main {
  public static void main(String[] args) {


    List<Car> carList = new ArrayList<>();

    for (int i = 0; i < 256; i++) {
      Car myCar = new Car(CarTypes.getCarType(), Colors.getColor());
      carList.add(myCar);
    }

    HashMap<CarTypes,Integer> carTypeHM = new HashMap<CarTypes,Integer>();

    for (int i = 0; i < carList.size(); i++) {
      if(carTypeHM.containsKey(carList.get(i).getTypes())) {
          carTypeHM.put(carList.get(i).getTypes(),carTypeHM.get(carList.get(i).getTypes()) + 1);
      } else {
        carTypeHM.put(carList.get(i).getTypes(),1);
      }
    }

    HashMap<Colors,Integer> carColorHM = new HashMap<Colors,Integer>();

    for (int i = 0; i < carList.size(); i++) {
      if(carColorHM.containsKey(carList.get(i).getColor())) {
        carColorHM.put(carList.get(i).getColor(),carColorHM.get(carList.get(i).getColor()) + 1);
      } else {
        carColorHM.put(carList.get(i).getColor(),1);
      }
    }

    System.out.println(carTypeHM);
    System.out.println(carColorHM);

    String car = "";
    int counter = 0;
    int counter2 = 0;
    for (int i = 0; i < carList.size(); i++) {
      for (int j = 0; j < carList.size(); j++) {
        if (carList.get(i).equals(carList.get(j))) {
          counter2 ++;
        }
      }
      if (counter2 > counter) {
        counter = counter2;
        car = carList.get(i).toString();
      }
    }

    System.out.println(car);
  }

}


