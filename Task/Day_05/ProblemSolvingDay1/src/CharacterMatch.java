import java.util.Scanner;

public class CharacterMatch {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        boolean isMatched = false;
//        String a, b;
//        System.out.println("Enter first string: ");
//        a = input.nextLine();
//        System.out.println("Enter second string: ");
//        b = input.nextLine();
//        for (char letter : b.toLowerCase().toCharArray()) {
//            if (a.toLowerCase().indexOf(letter) == -1) {
//                isMatched = false;
//                break;
//            } else {
//                isMatched = true;
//            }
//        }
//        if (isMatched) {
//            System.out.println("True");
//        } else {
//            System.out.println("False");
//        }





        Scanner input = new Scanner(System.in);
        boolean isMatched = false;
        String strA, strB;
        int count =0;

        System.out.println("Enter first string: ");
        strA = input.nextLine();
        System.out.println("Enter second string: ");
        strB = input.nextLine();


        for (int i = 0; i<strB.length(); i++){
            for (int j = 0; j<strA.length(); j++){
                if (strB.charAt(i) == strA.charAt(j)){
                    count ++;
                    break;
                }
            }

        }

        if (count == strB.length()) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}
