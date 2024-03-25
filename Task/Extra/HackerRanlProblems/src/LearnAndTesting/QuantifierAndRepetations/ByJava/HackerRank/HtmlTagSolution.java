package LearnAndTesting.QuantifierAndRepetations.ByJava.HackerRank;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HtmlTagSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        TreeSet<String> tagNames = new TreeSet<>();
        Pattern pattern = Pattern.compile("<\\s*?(\\w+)");

        for (int i= 0; i<n;i++){
            String fragment = scanner.nextLine();
            Matcher matcher = pattern.matcher(fragment);
            while (matcher.find()){
                tagNames.add(matcher.group(1));
            }
        }
        System.out.println(String.join(";", tagNames));
    }
}
