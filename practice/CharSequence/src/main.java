/**
 * Created by Adam on 2017. 04. 28..
 */
public class main {
  public static void main(String[] args) {
    CharSeq test = new CharSeq("Az ipafai papnak fapipája van");

    System.out.println((test.subSequence(0, test.length()).toString()));
  }
}
