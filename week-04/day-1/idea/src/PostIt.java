/**
 * Created by Adam on 2017. 04. 03..
 */
public class PostIt {
  String backgroundColor;
  String text;
  String textColor;

  public PostIt(String bColor, String text, String tColor) {
    backgroundColor = bColor;
    this.text = text;
    textColor = tColor;
  }

  public void postItPrint() {
    System.out.println(backgroundColor);
    System.out.println(text);
    System.out.println(textColor);

  }
}
