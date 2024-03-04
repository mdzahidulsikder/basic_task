import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 32, 1, 8, 32, 92, 41, 71, 34, 64, 99};
        System.out.println("The Max value is: " + findMaxValue(arr) + " and Min Value is: " + findMinValue(arr));
        convertingToListAndPrint(arr);
    }

    private static int findMinValue(int[] arr) {
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    private static int findMaxValue(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    private static void convertingToListAndPrint(int[] arr) {
        List<Integer> arrayList = new ArrayList<>();

        for(int i = 0; i<arr.length; i++){
              arrayList.add(arr[i]);
        }
        System.out.println("Result of array to arrayList : ");
        for (int i = 0; i<arrayList.size(); i++){
            System.out.print(arrayList.get(i) + " ");
        }
    }
}
