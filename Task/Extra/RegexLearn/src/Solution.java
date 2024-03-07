
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {


        String x = "wikipedia";

        System.out.println("Type your text: ");
        String s = "https://en.wikipedia.org/";

        Pattern pattern = Pattern.compile(x);
        Matcher matcher = pattern.matcher(s);

        int matchCount = 0;

        while (matcher.find()){
            matchCount++;
        }

        System.out.println(matchCount);

    }
}
