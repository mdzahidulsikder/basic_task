import java.util.Scanner;

public class OccurrenceOfCharacters {
    public static void main(String[] args) {
        char currentCharacter;
        String inputWord;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your word : ");
        inputWord = input.nextLine().toLowerCase().replace(" ","");
        if (inputWord == null || inputWord.isBlank() || inputWord.isEmpty()){
            System.out.println("please input a valid word.");
            throw new RuntimeException("wrong input");
        }
        char[][] arrChar = new char[1][inputWord.length()];

        for (int i = 0; i < inputWord.length(); i++) {
            arrChar[0][i]=inputWord.charAt(i);
        }
        int[] charOccurrence = new int[256];

        for (int i = 0; i<arrChar.length; i++){
            for (int j = 0; j<arrChar[i].length; j++){
                currentCharacter = arrChar[i][j];
                charOccurrence[currentCharacter] ++;
            }
        }
        for (int i = 0; i < charOccurrence.length; i++){
            if (charOccurrence[i]>0){
                System.out.println((char) i +" : " + charOccurrence[i]);
            }
        }
    }

}
