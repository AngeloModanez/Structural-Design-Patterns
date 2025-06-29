public class Flyweight {
  private static final String[] colors = { "Red", "Green", "Blue", "White", "Black" };

  public static void main(String[] args) {
    ShapeFactory factory = new ShapeFactory();

    for (int i = 0; i < 5; i++) {
      String color = getRandomColor();
      Circle circle = (Circle) factory.getCircle(color);

      circle.setX(getRandomX());
      circle.setY(getRandomY());
      circle.setRadius(10);

      circle.draw();
    }
  }

  private static String getRandomColor() {
    return colors[(int) (Math.random() * colors.length)];
  }

  private static int getRandomX() {
    return (int) (Math.random() * 100);
  }

  private static int getRandomY() {
    return (int) (Math.random() * 100);
  }
}
