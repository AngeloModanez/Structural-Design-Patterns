public class RedCircle implements DrawAPI {

  @Override
  public void drawCircle(int x, int y, int radius) {
    System.out.println("Desenhando um círculo vermelho na posição (X: " + x + ", Y: " + y + ", Raio: " + radius + ")");
  }
}
