public class Sharpie {
  private String color;
  private float width;
  private float inkAmount;

  public Sharpie(String color, float width, float inkAmount) {
    this.color = color;
    this.width = width;
    this.inkAmount = inkAmount;
  }

  public void use() {
    this.inkAmount --;
  }

  public float getInkAmount() {
    return inkAmount;
  }

  public void sharpieStatus() {
    System.out.print(color + " ");
    System.out.println(width + " ");
    System.out.print(inkAmount + " ");
  }
}

