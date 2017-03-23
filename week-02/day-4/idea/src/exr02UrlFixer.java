/**
 * Created by Adam on 2017. 03. 23..
 */
public class exr02UrlFixer {
  public static void main(String[] args) {
    String url = "https//www.reddit.com/r/nevertellmethebots";

    System.out.println(url.replaceAll("bots", "odds"));
    System.out.println(url.replaceFirst("bots","odds"));
  }
}
