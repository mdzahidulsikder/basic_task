package LearnAndTesting.QuantifierAndRepetations.HackerRank.LearnUDMY

class Test_01 {
    static void main(String[] args) {
        /**
         * regex = ?
         * ? = 0 or 1
         * apply = previous letter of '?' symbol
         * result =
         * Match of your string:  flavour
            Match of your string:  flavor
         */

        def text = "flavour\n" +
                "flavor\n" +
                "flavoar"
        def regex = "flavou?r"
        def matcher = text =~ regex
        if (matcher) {
            matcher.each { match ->
                println("Match of your string:  $match")
            }
        } else {
            println("Not match")
        }
    }
}
