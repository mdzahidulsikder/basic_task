package ProblemOther

class Problem_D {
    static void main(String[] args) {
        /**
         *  find the missing number
         */

        def array = [1, 2, 3, 4, 5, 7]
        def n = array.size() + 1
        def total = (n * (n + 1)) / 2
        def arrTotal = 0
        array.each { i -> arrTotal += i }
        def missingNumber = total - arrTotal
        println("The missing number: $missingNumber")
    }
}
