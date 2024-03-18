package ProblemOther

class Problem_C {
    static void main(String[] args) {
        def scanner = new Scanner(System.in)

        def arr = (1..6).collect { int it ->
            println "Input your number: $it"
            scanner.nextInt()
        }

        println "Input your key value: "
        def keyValue = scanner.nextInt()

        def sum = 0
        def totalPair = 0
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum = arr[i] + arr[j]
                if (sum == keyValue) {
                    println("${totalPair + 1}. Pair number is " + arr[i] + " and " + arr[j])
                    totalPair++
                }
            }
        }

        if (totalPair == 0) {
            println "There are no pairs with the given value."
        }


    }
}
