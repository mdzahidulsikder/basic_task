package LearnAndTesting.QuantifierAndRepetations.HackerRank.Day_01

class Problem_15 {
    static void main(String[] args) {
        /**
         * Positive Lookahead
         * lookahead
         * o(?=oo)
         *
         */

        def text = "gooo"
        def regex = "/o(?=oo)/"
        def matcher = text =~ regex
        if (matcher) {
            matcher.each { match ->
                println("Match of your string:  $match")
            }
        } else {
            println("Not found")
        }
    }
}
