package LearnAndTesting.QuantifierAndRepetations.HackerRank.Day_01

class Problem_08 {
    static void main(String[] args) {
        /**

         * */
        def text = "think?"
        def regex = "^\\D[^aeiou][^bcDF]\\S[^AEIOU][^.,]\$"
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
