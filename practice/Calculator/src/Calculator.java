import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Adam on 2017. 04. 24..
 */
public class Calculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Pleas type in the expression.");
    String input = scanner.nextLine();
    calcResult(input);
  }
  public static void calcResult (String input) {
    double result = 0;
    String operation = input.substring(0,1);
    String numbers = input.substring(2);
    String number1 = numbers.substring(0,numbers.indexOf(" "));
    String number2 = numbers.substring(numbers.indexOf(" "),numbers.length());
    double operand1 = Double.parseDouble(number1);
    double operand2 = Double.parseDouble(number2);

    if (operation.equals("+")) {
      result = operand1 + operand2;
    } else if (operation.equals("-")) {
      result = operand1 - operand2;
    } else if (operation.equals("*")) {
      result = operand1 * operand2;
    } else if (operation.equals("/")) {
      result = operand1 / operand2;
    } else if (operation.equals("%")) {
      result = operand1 % operand2;
    }

    System.out.println(result);
  }
}
