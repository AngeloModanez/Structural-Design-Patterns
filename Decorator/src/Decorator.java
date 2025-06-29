public class Decorator {
  public static void main(String[] args) {
    Shape circle = new Circle();
    Shape rectangle = new Rectangle();
    Shape redCircle = new RedShape(new Circle());
    Shape redRectangle = new RedShape(new Rectangle());

    System.out.println("Círculo normal:");
    circle.draw();

    System.out.println("\nRetângulo normal:");
    rectangle.draw();

    System.out.println("\nCírculo com borda vermelha:");
    redCircle.draw();

    System.out.println("\nRetângulo com borda vermelha:");
    redRectangle.draw();
  }
}
