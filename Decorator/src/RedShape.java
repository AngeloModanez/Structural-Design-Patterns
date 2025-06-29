public class RedShape extends ShapeDecorator {
  public RedShape(Shape shape) {
    super(shape);
  }

  public void draw() {
    shape.draw();
    setRedBorder();
  }

  private void setRedBorder() {
    System.out.println("Adicionando borda vermelha");
  }
}
