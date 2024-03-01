import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicateElement {
    public static void main(String[] args) {
        int arrSize, value;

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.print("Input the array sizes: ");
        arrSize = input.nextInt();
        System.out.println("Input the array value: ");

        for (int i = 0; i < arrSize; i++) {
            value = input.nextInt();
            arrayList.add(value);
        }


        for (int i = 0; i < arrayList.size() - 1; i++) {
            for (int j = i + 1; j < arrayList.size(); j++) {
                if (arrayList.get(i) == arrayList.get(j)) {
                    arrayList.remove(j);
                }
            }
        }

        System.out.println("After remove duplicate value your array is : ");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(i + ", ");
        }


    }
}
