import java.util.Scanner;

public class VideoMediaPlayer extends AbstractMediaPlayer implements VideoPlayer {

    @Override
    public void play() {
        System.out.println("Video is Playing...");
    }

    @Override
    public void pause() {
        System.out.println("Video is paused...");
    }

    @Override
    public void stop() {
        System.out.println("Video is stopped...");
    }

    @Override
    public void playVideo(String s) {
        if (s.equalsIgnoreCase("Video")) {
            System.out.println("Video: what do you want...type : play/purse/stop");
            Scanner sc = new Scanner(System.in);
            String text = sc.next();
            if (text.equalsIgnoreCase("play")) {
                play();
            } else if (text.equalsIgnoreCase("purse")) {
                pause();
            } else if (text.equalsIgnoreCase("stop")) {
                stop();
            } else {
                System.out.println("Wrong Input. Please try later...");
            }
        }
    }
}
