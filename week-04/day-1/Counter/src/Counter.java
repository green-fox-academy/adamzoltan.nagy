
public class Counter {
  int number;
  int reset;

  public Counter() {
    this(0);
  }

  public Counter(int number) {
    this.number = number;
    reset = number;
  }

  public int add(int x) {
    this.number = number + x;
    return number;
  }

  public void add() {
    this.number ++;
  }

  public void get() {
    System.out.println(this.number);
  }

  public int reset() {
    if (reset == 0) {
      return this.number =0;
    }
    return this.number = reset;
  }

}
