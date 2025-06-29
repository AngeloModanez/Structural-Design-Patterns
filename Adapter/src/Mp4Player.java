public class Mp4Player implements AdvancedMediaPlayer {

  @Override
  public void playVlc(String fileName) {
    throw new UnsupportedOperationException("Unimplemented method 'playVlc'");
  }

  @Override
  public void playMp4(String fileName) {
    System.out.println("Tocando MP4: " + fileName);
  }

}
