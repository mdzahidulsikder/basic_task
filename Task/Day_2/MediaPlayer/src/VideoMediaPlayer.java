public class VideoMediaPlayer extends AbstractMediaPlayer implements VideoPlayer{
    public VideoMediaPlayer(String mediaTitle) {
        super(mediaTitle);
    }

    @Override
    public void play() {
        System.out.println("Starting playback of video: " + getMediaTitle());
        // Add logic to start playback
    }

    @Override
    public void stop() {
        System.out.println("Stopping video: " + getMediaTitle());
        // Add logic to stop video playback
    }

    @Override
    public void pause() {
        System.out.println("Pausing video: " + getMediaTitle());
        // Add logic to pause video playback
    }

    @Override
    public void playVideo() {
        System.out.println("Playing video: " + getMediaTitle());
        // Add logic to play video
    }
}
