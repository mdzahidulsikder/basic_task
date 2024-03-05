import java.util.*;

public class Main {
    public static void main(String[] args) {


        String name;
        double mark;
        System.out.println("How many students add to your database:");

        Scanner input = new Scanner(System.in);
        int databaseSize = input.nextInt();

        HashMap<String, Double> hashMap = new HashMap<>();
        for (int i = 0; i < databaseSize; i++) {
            System.out.println("Enter Student name: ");
            name = input.next();
            System.out.println("Enter mark: ");
            mark = input.nextDouble();
            hashMap.put(name, mark);
        }

        List<Map.Entry<String, Double>> hashList = new ArrayList<>(hashMap.entrySet());
        System.out.println("Unsorted result: " + hashList);
        Collections.sort(hashList, (hashList1, hashList2) -> hashList2.getValue().compareTo(hashList1.getValue())); // compare two value using lambda expression
        System.out.println("Sort result: " + hashList); // sorted desc


        LinkedHashMap<String, Double> hashMapSort = new LinkedHashMap<>();  // after sort as descending value it will store insertion order so that we can get first, second and third position from sorted place

        for (Map.Entry<String, Double> entry : hashList) {
            hashMapSort.put(entry.getKey(), entry.getValue());
        }

        System.out.println("1. Enter the student name: ");
        String searchName = input.next();

        String detailsAndPosition = findDetailsAndPositionByName(hashList, searchName);

        if (!detailsAndPosition.equals("")) {
            System.out.println(detailsAndPosition);
        } else {
            System.out.println("No student found with the entered name");
        }


        System.out.print("2. Enter the position: ");
        int positions = input.nextInt();
        List<String> nameAndMarks = findNameAndMarksByPosition(hashList, positions);
        if (!nameAndMarks.isEmpty()) {
            for (String nameAndMark : nameAndMarks) {
                System.out.println(nameAndMark);
            }

        }

        System.out.println("3. Enter the mark: ");
        double searchMark = input.nextDouble();
        List<String> nameAndPositions = findNameAndPositionByMarks(hashList, searchMark);
        if (!nameAndPositions.isEmpty()) {

            for (String result : nameAndPositions) {
                System.out.println(result);
            }
        } else {
            System.out.println("No one got this marks");
        }


        System.out.println("1. Enter the student name: ");
        String searchName2 = input.next();
        System.out.println("Enter the marks: ");
        double searchMark2 = input.nextDouble();

        String detailsAndPositionByName = findDetailsAndPositionByNameAndMark(hashList, searchName2, searchMark2);

        if (!detailsAndPosition.equals("")) {
            System.out.println(detailsAndPositionByName);
        } else {
            System.out.println("No student found with the entered name and marks");
        }
    }



    private static String findDetailsAndPositionByName(List<Map.Entry<String, Double>> sortedList, String searchName) {
        for (int i = 0; i < sortedList.size(); i++) {
            Map.Entry<String, Double> entry = sortedList.get(i);
            if (entry.getKey().equals(searchName)) {
                double marks = entry.getValue();
                int position = i + 1;
                return "Student " + searchName + " has marks " + marks + " and is at position " + position;
            }
        }
        return "";
    }


    private static List<String> findNameAndPositionByMarks(List<Map.Entry<String, Double>> sortedList, double searchMark) {
        List<String> nameAndPositions = new ArrayList<>();
        for (int i = 0; i < sortedList.size(); i++) {
            if (sortedList.get(i).getValue().equals(searchMark)) {
                String name = sortedList.get(i).getKey();
                int position = i + 1;
                nameAndPositions.add(position + ". Student name = " + name + " and is at position " + position);
            }
        }
        return nameAndPositions;
    }


    private static List<String> findNameAndMarksByPosition(List<Map.Entry<String, Double>> sortedList, int searchPosition) {
        List<String> nameAndMarks = new ArrayList<>();
        if (searchPosition > 0 && searchPosition <= sortedList.size()) {
            String name = sortedList.get(searchPosition - 1).getKey();
            double marks = sortedList.get(searchPosition - 1).getValue();
            nameAndMarks.add("Student name is : " + name + " and marks is : " + marks);
        }
        return nameAndMarks;
    }


    private static String findDetailsAndPositionByNameAndMark(List<Map.Entry<String, Double>> sortedList, String searchName, double searchMark) {
        for (int i = 0; i < sortedList.size(); i++) {
            Map.Entry<String, Double> entry = sortedList.get(i);
            if (entry.getKey().equals(searchName) && entry.getValue().equals(searchMark)) {
                int position = i + 1;
                return "Student " + searchName + " with marks " + searchMark + " is at position " + position;
            }
        }
        return "";
    }


}

