package LearnAndTesting.QuantifierAndRepetations.ByJava.HackerRank;
import java.util.*;
import java.util.regex.*;
public class FindASubWord {
    public static Pattern getPattern(String sub) {
        return Pattern.compile("\\B" + sub + "\\B");
    }

    public static int getMatches(Pattern pattern, String test) {
        int     matches = 0;
        Matcher match   = pattern.matcher(test);
        while(match.find()) {
            matches++;
        }
        return matches;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int      sentenceCount = Integer.parseInt(sc.nextLine());
            String[] sentences     = new String[sentenceCount];
            for(int i = 0; i < sentenceCount; i++) {
                sentences[i] = sc.nextLine();
            }

            int queryCount = Integer.parseInt(sc.nextLine());
            while(queryCount-- > 0) {
                int     matches = 0;
                Pattern pattern = getPattern(sc.nextLine());
                for(String s : sentences) {
                    matches += getMatches(pattern, s);
                }
                System.out.println(matches);
            }
        } finally {
            sc.close();
        }
    }
}
