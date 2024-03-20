package LearnAndTesting.QuantifierAndRepetations.HackerRank.LearnUDMY

class Test_02 {
    static void main(String[] args) {
        /**
         * regex = *
         * * = 0 to infinite
         */

        def text = "bu\n" +
                "buz\n" +
                "buzz\n" +
                "buzzz\n"
        def regex = "buz*"
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
