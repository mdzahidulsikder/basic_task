package ProblemOther

class Problem_C2 {
    static void main(String[] args) {
        def scanner = new Scanner(System.in)
        def arr = (1..6).collect {
            int it ->
                print("$it. Input value: ")
                scanner.nextInt()
        }
        println("Input your key value: ")
        def key = scanner.nextInt()
        def sum = 0;
        def totalPair = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = 0; j < arr.size(); j++) {
                sum = arr[i] + arr[j]
                if (sum == key){
                    println(arr[i]+" and " + arr[j]+ " are pair")
                    totalPair ++
                }
            }

        }

        if (totalPair == 0){
            println("there is no pair value.")
        }


    }
}
