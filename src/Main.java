
public class Main {
    public static void main(String[] args) {
        OldAudioPlayer oldAudioPlayer = new OldAudioPlayer();
        MediaPlayer mediaPlayer = new AudioPlayerAdapter(oldAudioPlayer);

        mediaPlayer.play("mp3", "song.mp3");
        mediaPlayer.play("mp4", "video.mp4");
    }
}


