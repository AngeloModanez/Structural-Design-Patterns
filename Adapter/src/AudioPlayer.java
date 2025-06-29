public class AudioPlayer implements MediaPlayer {
  private MediaAdapter mediaAdapter;

  @Override
  public void play(String audioType, String fileName) {
    if (audioType.equalsIgnoreCase("mp3")) {
      System.out.println("Tocando MP3: " + fileName);
    } else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
      mediaAdapter = new MediaAdapter(audioType);
      mediaAdapter.play(audioType, fileName);
    } else {
      System.out.println("Formato não suportado: " + audioType + "; Arquivo: " + fileName);
    }
  }

}
