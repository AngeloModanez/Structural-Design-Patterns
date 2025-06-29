public class RealImage implements Image {
  public String fileName;

  public RealImage(String fileName) {
    this.fileName = fileName;
    loadFromDisk();
  }

  public void loadFromDisk() {
    System.out.println("Carregando arquivo " + fileName + " do disco...");
  }

  @Override
  public void display() {
    System.out.println("Exibindo imagem: " + fileName);
  }
}
