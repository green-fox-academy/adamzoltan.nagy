/**
 * Created by Adam on 2017. 03. 21..
 */
public class VariableMutation {
  public static void main(String[] args) {
    int a = 3;
    System.out.println(a +=10);

    int b = 100;
    System.out.println(b -=7);

    int c = 44;
    System.out.println(c *=2);

    int d = 125;
    System.out.println(d /=5);

    int e = 8;
    System.out.println(e *=e);

    int f1 = 123;
    int f2 = 345;
    boolean gthan = (f1 > f2);
    System.out.println(f1 + " > " + f2 +" : "  + gthan);

    int g1 = 350;
    int g2 = 200;
    boolean gthan2 = (g2*2 > g1);
    System.out.println(g2 + " *2 > " + g1 + " : " + gthan2);

    double h = 1357988018575474.;
    boolean div = (h % 11) == 0;
    System.out.println("11 is divisor: " + div);

    int i1 = 10;
    int i2 = 3;
    boolean power = (i1 > i2 * i2 && i1 < i2 * i2 * i2 );
    System.out.println(i1 + " is higher than " + i2 + " squared and smaller than " + i2 + " cubed: " + power);

    int j = 1521;
    boolean div2 = (j % 3 == 0 || j % 5 == 0);
    System.out.println(j + " is dividable by 3 or 5: " + div2);

    String k = "Apple";
    k = k + k + k + k;
    System.out.println(k);




  }
}
