class ProblemA {
    static void main(String[] args) {

        def scanner = new Scanner(System.in)
        println("Give array size: ")
        int size = scanner.nextInt()
        int[] arr = new int[size]

        for (int i = 0; i < arr.size(); i++) {
            print("Input value ${i + 1} :")
            arr[i] = scanner.nextInt()

        }
        println("The array is " + arr)

        Arrays.sort(arr)

        println("Sorted array:")
        println(arr)

        int max = arr[0]
        int min = arr[0]
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]
            }
            if (arr[i] < min) {
                min = arr[i]
            }
        }

        println("minimum value is : " + min)
        println("maximum value is : " + max)


    }
}
