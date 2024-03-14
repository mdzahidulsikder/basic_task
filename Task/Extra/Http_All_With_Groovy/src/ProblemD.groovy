class ProblemD {
    static void main(String[] args) {
        def scanner = new Scanner(System.in)
        println("Input your array size: ")
        int arrSize = scanner.nextInt()
        int[] arr = new int[arrSize];

        int arrayValueSum = 0;
        int totalSum = (arrSize * (arrSize + 1)) / 2

        for (int i = 0; i < arr.length - 1; i++) {
            print("${i + 1}. Input array value : ")
            arr[i] = scanner.nextInt()
            arrayValueSum += arr[i]
        }
        int missingValue = totalSum - arrayValueSum
        println("Output : The missing number is " + missingValue)

    }
}
