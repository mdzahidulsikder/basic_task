class ProblemE {
    static void main(String[] args) {
        def scanner = new Scanner(System.in)
        println("Input your array size: ")
        int arrSize = scanner.nextInt()
        ArrayList<Integer> arr = new ArrayList<>()

        for (int i = 0; i < arrSize; i++) {
            print("${i + 1}. Input array value : ")
            int value = scanner.nextInt()
            arr.add(value)
        }

        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(j) == arr.get(i)) {
                    arr.remove(j)
                    j--
                }
            }
        }

        println("After removing duplicate values, your array is: ")
        for (int i = 0; i < arr.size(); i++) {
            print(arr.get(i) + " ")
        }
    }
}
