public class AdapterDemo {
  public static void main(String[] args) {
    AudioPlayer player = new AudioPlayer();

    player.play("mp3", "musica.mp3");
    player.play("mp4", "video.mp4");
    player.play("vlc", "filme.vlc");
    player.play("avi", "video.avi");
  }
}
