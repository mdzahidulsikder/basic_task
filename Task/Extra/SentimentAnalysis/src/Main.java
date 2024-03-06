import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args)  {

        SentimentAnalysisService sentimentAnalysisService = new SentimentAnalysisService();
        Set<String> negativeWordList = sentimentAnalysisService.findNegativeWordList();
        Set<String> positiveWordList = sentimentAnalysisService.findPositiveWordList();
        Set<String> stopWordList = sentimentAnalysisService.findStopWords();

        Scanner input = new Scanner(System.in);
        System.out.println("Input your review: ");
        String text = input.nextLine();

        List<String> wordsList = extractWords(text);
        System.out.println("Words in the review: ");

        int positiveCount = 0;
        int negativeCount = 0;
        boolean negativeFlag = false;
        
        for (String word : wordsList) {
            if (!stopWordList.contains(word)) {
                if (word.contains("not")) {
                    negativeFlag = true;
                }
                if (positiveWordList.contains(word) && !negativeFlag) {
                    positiveCount++;
                } else if (negativeWordList.contains(word) && !negativeFlag) {
                    negativeCount--;
                } else if (positiveWordList.contains(word) && negativeFlag) {
                    negativeCount--;
                    negativeFlag = false;
                } else if (negativeWordList.contains(word) && negativeFlag) {
                    positiveCount++;
                    negativeFlag = false;
                }
            }
        }
        System.out.println("Score = "+(positiveCount + negativeCount));
    }

    private static List<String> extractWords(String text) {
        List<String> wordList = new ArrayList<>();
        Scanner scanner = new Scanner(text);
        while (scanner.hasNext()) {
            String word = scanner.next().replaceAll("[^a-zA-Z]", "");
            wordList.add(word);
        }
        scanner.close();
        return wordList;
    }
}