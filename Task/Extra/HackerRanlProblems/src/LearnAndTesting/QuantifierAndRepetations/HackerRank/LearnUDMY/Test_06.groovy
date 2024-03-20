package LearnAndTesting.QuantifierAndRepetations.HackerRank.LearnUDMY

class Test_06 {
    static void main(String[] args) {
        /**
         * regex = search all into dubole comma""  = "\".[^\"]+\""
         * . = any character
         * \" = "
         * + = 1 or more
         * */

        def text = "earth has \"montains\" and many \"seas\" to explore"

        def regex = "\".[^\"]+\""
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
