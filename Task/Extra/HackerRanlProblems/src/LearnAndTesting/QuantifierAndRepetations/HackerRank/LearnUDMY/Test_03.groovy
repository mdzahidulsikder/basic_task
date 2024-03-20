package LearnAndTesting.QuantifierAndRepetations.HackerRank.LearnUDMY

class Test_03 {
    static void main(String[] args) {
        /**
         * regex = +
         * + = 1 to infinite
         */

        def text = "124568\n" +
                "1\n" +
                "12"
        def regex = "[0-9][0-9]+"
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
