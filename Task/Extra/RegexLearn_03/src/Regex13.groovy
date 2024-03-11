import java.util.Scanner;

public class Regex13 {
    public static void main(String[] args) {
        def scanner = new Scanner(System.in)
        def regex = "^[\\d]+[A-Z]+[a-z]+\$";
        def inputText = scanner.nextLine()=~regex
        if (inputText.findAll()){
            println(true)
        }else {
            println(false)
        }
    }
}
