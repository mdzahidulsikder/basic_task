package ProblemOther

class Problem_A {
    static void main(String[] args) {
        /**
         * Max and min value find
         */


        def arr = [10, 20, 60, 70, 80, 6]
        def minValue = Integer.MAX_VALUE
        def maxValue = Integer.MIN_VALUE
        arr.each { number ->
            if (number < minValue) minValue = number
            if (number > maxValue) maxValue = number
        }

        println("Maximum value : $maxValue")
        println("Minimum value : $minValue")
    }
}
