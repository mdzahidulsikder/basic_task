class ProblemC {
    static void main(String[] args) {

        def scanner = new Scanner(System.in)
        int givenNumber, sum, totalPair;
        int[] arr = new int[6]
        for (int i= 0; i<arr.length; i++){
            println("Input yor number: ${i+1}")
            arr[i] = scanner.nextInt()
        }

        println("Input your key value: ")
        givenNumber = scanner.nextInt()
        for (int i = 0; i<arr.length-1; i++){
            for (int j = i+1; j<arr.length; j++){
                sum = arr[i]+ arr[j]
                if (sum == givenNumber){
                    println("${totalPair+1}. Pair number is " + arr[i]+ " and " + arr[j])
                    totalPair++
                }
            }
        }
        if (totalPair == 0){
            println("There is no pair value")
        }
    }
}
