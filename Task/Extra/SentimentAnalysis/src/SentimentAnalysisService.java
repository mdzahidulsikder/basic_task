import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class SentimentAnalysisService {

    public Set<String> findNegativeWordList() {
        Set<String> negativeWords = new HashSet<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/resource/negative-words.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                negativeWords.add(line.trim().toLowerCase());
            }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return negativeWords;
    }

    public Set<String> findPositiveWordList() {
        Set<String> positiveWords = new HashSet<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/resource/positive-words.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                positiveWords.add(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return positiveWords;
    }

    public Set<String> findStopWords() {
        Set<String> stopWordsList = new HashSet<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/resource/stop-words.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                stopWordsList.add(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return stopWordsList;
    }
}