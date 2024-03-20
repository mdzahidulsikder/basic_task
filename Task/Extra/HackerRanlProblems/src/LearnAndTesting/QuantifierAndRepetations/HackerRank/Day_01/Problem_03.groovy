package LearnAndTesting.QuantifierAndRepetations.HackerRank.Day_01

class Problem_03 {
    static void main(String[] args) {
        /**
         *Matching Digits & Non-Digit Characters
         * */
        def text = "06-11-2015"
        def regex = "[0-9]{2}\\D[0-9]{2}\\D[0-9]{4}"
        def matcher = text =~ regex
        if (matcher){
            matcher.each {match ->
                println("Match of your string:  $match")
            }
        }
        else {
            println("Not found")
        }
    }
}
