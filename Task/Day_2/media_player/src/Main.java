import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        AudioMediaPlayer audioMediaPlayer= new AudioMediaPlayer();
        VideoMediaPlayer videoMediaPlayer = new VideoMediaPlayer();

        Scanner s = new Scanner(System.in);
        System.out.println("input audio / video to play...");
        String i = s.next().toLowerCase();
       if ((i.equalsIgnoreCase("audio")) || (i.equalsIgnoreCase("video")) ){
           audioMediaPlayer.playAudio(i);
           videoMediaPlayer.playVideo(i);
       }
    }
}
