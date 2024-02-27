import java.util.Scanner;

public class AudioMediaPlayer extends AbstractMediaPlayer implements AudioPlayer {
    @Override
    public void play() {
        System.out.println("Audio is Playing...");
    }

    @Override
    public void pause() {
        System.out.println("Audio is paused...");
    }

    @Override
    public void stop() {
        System.out.println("Audio is stopped...");
    }

    @Override
    public void playAudio(String s) {
        if (s.equalsIgnoreCase("audio")) {
            System.out.println("Audio: what do you want...type : play/purse/stop");
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
