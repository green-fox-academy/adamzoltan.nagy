import java.util.stream.IntStream;

/**
 * Created by Adam on 2017. 04. 28..
 */
public class CharSeq implements CharSequence {
  private String string;

  public CharSeq(String string) {
    this.string = string;
  }

  @Override
  public int length() {
    return string.length();
  }

  @Override
  public char charAt(int index) {
    return string.charAt(index);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    start = 0;
    end = string.length();
    String reversed = string.substring(end-1,end);
    for (int i = end - 1; i > start; i-- ) {
      reversed = reversed.concat(string.substring(i - 1,i));
    }
    CharSeq charseq = new CharSeq(reversed);
    return charseq;
  }

  @Override
  public IntStream chars() {
    return null;
  }

  @Override
  public IntStream codePoints() {
    return null;
  }

  @Override
  public String toString() {
    return string;
  }
}


