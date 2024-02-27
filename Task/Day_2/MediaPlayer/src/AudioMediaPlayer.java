public class AudioMediaPlayer extends AbstractMediaPlayer implements AudioPlayer{
    public AudioMediaPlayer(String mediaTitle) {
        super(mediaTitle);
    }

    @Override
    public void playAudio() {
        System.out.println("Playing audio: " + getMediaTitle());
        // Add logic to play audio file
    }

    @Override
    public void play() {
        System.out.println("Starting playback of audio: " + getMediaTitle());
        // Add logic to start playback
    }

    @Override
    public void stop() {
        System.out.println("Stopping audio: " + getMediaTitle());
        // Add logic to stop audio playback
    }

    @Override
    public void pause() {
        System.out.println("Pausing audio: " + getMediaTitle());
        // Add logic to pause audio playback
    }
}
