package LearnAndTesting.QuantifierAndRepetations.HackerRank.LearnUDMY

class Test_07 {
    static void main(String[] args) {
        /**
         * Lazy mode = opposite to greedy mode = less match
         * greedy mode = repeat maximum number of times as possible
         * lazy mode = repeat minimum number of time as possible
         */

        def text = "earth has \"montains\" and many \"seas\" to explore"

        def regex = "\".+?\""
        def matcher = text =~ regex
        if (matcher) {
            int i = 1
            matcher.each { match ->
                println("$i. Match of your string:  $match")
                i++
            }
        } else {
            println("Not match ")
        }
    }
}
