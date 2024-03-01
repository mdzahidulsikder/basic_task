import java.util.Arrays;
import java.util.Scanner;

public class FindMissingNumber {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        System.out.println("Input the array size: ");
        int arrSize = input.nextInt();
        int arr[] = new  int[arrSize];
        int sumValue = 0;
        int actualValue = (arrSize*(arrSize+1))/2;

        System.out.println("Input array value: ");

        for (int i = 0; i<arr.length-1; i++){
            arr[i] = input.nextInt();
            if (arr[i]>arrSize || arr[i]<0){
                System.out.println("You can not input over max number:" + arrSize);
                throw new Exception("Wrong input");
            }
            sumValue = sumValue+arr[i];
        }
        int missingNumber = actualValue - sumValue;
        System.out.println("Missing number is:  " + missingNumber);

    }

}
