public class GreenCircle implements DrawAPI {

  @Override
  public void drawCircle(int x, int y, int radius) {
    System.out.println("Desenhando um círculo verde (X: " + x + ", Y: " + y + ", Raio: " + radius + ")");
  }
}
