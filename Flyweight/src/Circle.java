public class Circle implements Shape {
  private int x, y, radius;
  private String color;

   public Circle(String color) {
        this.color = color;
    }

  public void setX(int x) {
    this.x = x;
  }

  public void setY(int y) {
    this.y = y;
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }

  @Override
  public void draw() {
    System.out.println(
        "Circulo com: cor " + color + ", largura de " + x + ", altura de " + y + " e com um raio de " + radius);
  }
}
