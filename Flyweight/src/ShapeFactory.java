import java.util.HashMap;

public class ShapeFactory {
  private HashMap<String, Shape> circleMap = new HashMap<>();

  public Shape getCircle(String color) {
    Circle circle = (Circle) circleMap.get(color);

    if (circle == null) {
      circle = new Circle(color);
      circleMap.put(color, circle);
      System.out.println("Criando novo círculo da cor: " + color);
    }

    return circle;
  }
}
