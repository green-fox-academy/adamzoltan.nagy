/**
 * Created by Adam on 2017. 03. 23..
 */
public class exr04ToDoPrint {
  public static void main(String[] args) {
    String todoText = " - Buy milk\n";
    String myToDo = "My todo:\n";
    String download = " - Download games\n";
    String diablo = "     - Diablo";

    todoText = myToDo.concat(todoText);
    todoText = todoText.concat(download);
    todoText = todoText.concat(diablo);

    System.out.println(todoText);

  }
}
