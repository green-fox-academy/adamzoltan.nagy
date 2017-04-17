/**
 * Created by Adam on 2017. 04. 17..
 */
public class Main {
  public static void main(String[] args) {

    Ship pirateShip1 = new Ship();
    Ship pirateShip2 = new Ship();
    Ship pirateShip3 = new Ship();
    Ship pirateShip4 = new Ship();
    Ship pirateShip5 = new Ship();
    Ship pirateShip6 = new Ship();
    Ship pirateShip7 = new Ship();
    Ship pirateShip8 = new Ship();

    pirateShip1.fillShip();
    pirateShip2.fillShip();
    pirateShip3.fillShip();
    pirateShip4.fillShip();
    pirateShip5.fillShip();
    pirateShip6.fillShip();
    pirateShip7.fillShip();
    pirateShip8.fillShip();

//    pirateShip1.logBook();
//    pirateShip2.logBook();
//
//    pirateShip1.battle(pirateShip2);
//    pirateShip1.logBook();
//    pirateShip2.logBook();

    Armada armada1 = new Armada();
    Armada armada2 = new Armada();

    armada1.addShip(pirateShip1);
    armada1.addShip(pirateShip2);
    armada1.addShip(pirateShip3);
    armada1.addShip(pirateShip4);
    armada2.addShip(pirateShip5);
    armada2.addShip(pirateShip6);
    armada2.addShip(pirateShip7);
    armada2.addShip(pirateShip8);

    armada1.war(armada2);

  }
}
