import java.util.Arrays;
import java.util.Scanner;

public class HighestAndLowestFromArray {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int array[] = new int[5];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Input Integer value: ");
            array[i] = s.nextInt();
        }

        int max = array[0];
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Unsorted array: " + Arrays.toString(array));
        System.out.println(min + " minimum");
        System.out.println(max + " maximum");
        Arrays.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}

