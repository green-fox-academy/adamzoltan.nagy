/**
 * Created by Adam on 2017. 03. 27..
 */
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class lotto {

  public static void main(String[] args) {
    ArrayList <String> otos = new ArrayList<>();
    ArrayList <String> hetiszamok = new ArrayList<>();
    ArrayList <String> szamok = new ArrayList<>();
    try {
      for(String line : Files.readAllLines(Paths.get("otos.csv"))) {
        otos.add(line);
      }
      int subString = 0;
      String nyeroszamok;
      for (int i = 0; i < otos.size(); i++) {
        subString = otos.get(i).lastIndexOf("Ft");
        nyeroszamok = otos.get(i).substring(subString + 3);
        hetiszamok.add(i,nyeroszamok);
      }
      System.out.println(hetiszamok);
      for (int j = 0; j < hetiszamok.size(); j ++) {
        szamok.addAll(Arrays.asList(hetiszamok.get(j).split(";")));
      }

      HashMap <String, Integer> szamokGyak = new HashMap<>();

      for (int l = 0; l < szamok.size(); l++ ) {
        if (szamokGyak.containsKey(szamok.get(l))) {
          szamokGyak.put(szamok.get(l),szamokGyak.get(szamok.get(l))+1);
        } else {
          szamokGyak.put(szamok.get(l),1);
        }
      }

      System.out.println(szamok);
      System.out.println(szamokGyak);
      ArrayList <Integer> leggyakoribb = new ArrayList<>();


    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
