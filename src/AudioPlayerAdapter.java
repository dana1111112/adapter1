public class AudioPlayerAdapter implements MediaPlayer {
    private OldAudioPlayer oldAudioPlayer;

    public AudioPlayerAdapter(OldAudioPlayer oldAudioPlayer) {
        this.oldAudioPlayer = oldAudioPlayer;
    }

    @Override
    public void play(String mediaType, String fileName) {
        if (mediaType.equalsIgnoreCase("mp3")) {
            oldAudioPlayer.playAudio(fileName);
        } else {
            System.out.println("Unsupported file: " + mediaType);
        }
    }
}
