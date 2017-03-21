/**
 * Created by Adam on 2017. 03. 21..
 */
public class SecondsinADAy {
  public static void main(String[] args) {
    int currentHours = 14;
    int currentMinutes = 34;
    int currentSeconds = 42;
    int totalSeconds = 86400;

    System.out.println("Remaining seconds: " + (totalSeconds-currentHours*60*60-currentMinutes*60-currentSeconds));
  }
}
