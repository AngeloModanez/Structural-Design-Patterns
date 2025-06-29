public class VlcPlayer implements AdvancedMediaPlayer {

  @Override
  public void playVlc(String fileName) {
    System.out.println("Tocando VLC: " + fileName);
  }

  @Override
  public void playMp4(String fileName) {
    throw new UnsupportedOperationException("Unimplemented method 'playMp4'");
  }
}
