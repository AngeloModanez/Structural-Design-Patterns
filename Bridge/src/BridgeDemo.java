public class BridgeDemo {
  public static void main(String[] args) {
    Shape redCircle = new Circle(10, 20, 5, new RedCircle());
    Shape greenCircle = new Circle(30, 40, 15, new GreenCircle());

    redCircle.draw();
    greenCircle.draw();
  }
}
