public class ProxyDemo {
  public static void main(String[] args) {
    Image image1 = new ProxyImage("Borboleta.png");
    Image image2 = new ProxyImage("Smilinguido.png");

    System.out.println("Primeira chamada:");
    image1.display();

    System.out.println("\nSegunda chamada:");
    image1.display();

    System.out.println("\nTerceira chamada:");
    image2.display();

    System.out.println("\nQuarta chamada:");
    image2.display();
  }
}
