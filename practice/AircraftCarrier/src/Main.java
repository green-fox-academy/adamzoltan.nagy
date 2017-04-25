/**
 * Created by Adam on 2017. 04. 25..
 */
public class Main {
  public static void main(String[] args) {

//    Aircraft aircraft1 = new F16();
//
//    aircraft1.getStatus();
//    aircraft1.refillAmmo(300);
//    aircraft1.getStatus();

    Carrier carrier1 = new Carrier(5000, 10000);
    carrier1.addAircraft("F16");
    carrier1.addAircraft("F16");
    carrier1.addAircraft("F16");
    carrier1.addAircraft("F16");
    carrier1.addAircraft("F16");
    carrier1.addAircraft("F16");
    carrier1.fill();

    Carrier carrier2 = new Carrier(5000, 100);
    carrier2.addAircraft("F16");
    carrier2.addAircraft("F16");
    carrier2.addAircraft("F16");
    carrier2.addAircraft("F16");
    carrier2.addAircraft("F16");
    carrier2.addAircraft("F16");
    carrier2.fill();


    carrier1.getStatus();
    carrier2.getStatus();

    carrier1.fight(carrier2);

  }
}
