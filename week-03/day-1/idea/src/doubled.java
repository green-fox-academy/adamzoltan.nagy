
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class doubled {
  public static void main(String[] args) {

    ArrayList <String> originalText = new ArrayList<>();

    try {
      for(String line : Files.readAllLines(Paths.get("duplicated-chars.txt"))) {
        originalText.add(line);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

    ArrayList <String> duplicateRemoved = new ArrayList<>();
    String textContainer = "";

    for (int i = 0; i < originalText.size(); i++) {
      for ( int j = 0; j < originalText.get(i).length(); j +=2) {
        textContainer = textContainer + (originalText.get(i).charAt(j));
      }
      duplicateRemoved.add(i,textContainer);
      textContainer = "";
    }

    for (int j = 0; j < duplicateRemoved.size(); j++) {
      System.out.println(duplicateRemoved.get(j) + "\n");
    }
  }
}
