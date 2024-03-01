import java.util.Scanner;

public class SumPairForGivenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[6];
        int givenNum, sum, totalPair=0;
        System.out.println("Input 6 Integer number: ");
        for (int i = 0; i<arr.length; i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Input your key value: ");
        givenNum = input.nextInt();
        for (int i = 0; i<arr.length-1;i++){
            for (int j = i+1; j<arr.length; j++){
                sum = arr[i] + arr[j];
                if (sum == givenNum){
                    System.out.println("Pair number is " + arr[i] +" and "+ arr[j]);
                    totalPair++;
                }
            }
        }
        if (totalPair == 0 ){
            System.out.println("There is no pair value.");
        }

    }
}
