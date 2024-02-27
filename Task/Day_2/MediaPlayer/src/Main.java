public class Main {
    public static void main(String[] args) {
        AudioMediaPlayer audioPlayer = new AudioMediaPlayer("Song Title");
        // Create a video media player
        VideoMediaPlayer videoPlayer = new VideoMediaPlayer("Movie Title");

        // Play audio
        audioPlayer.playAudio();
        // Play video
        videoPlayer.playVideo();

        // Example of using common methods
        audioPlayer.play();
        videoPlayer.play();

        // Stop audio
        audioPlayer.stop();
        // Stop video
        videoPlayer.stop();

        // Pause audio
        audioPlayer.pause();
        // Pause video
        videoPlayer.pause();
    }
}
