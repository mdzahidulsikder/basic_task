package LearnAndTesting.QuantifierAndRepetations.HackerRank.LearnUDMY

class Test_04 {
    static void main(String[] args) {
        /**
         * regex = phone number match
         * {3} = length = 3 time
         * {3,} = length = 3 to infinite
         * {lower, upper}
         * */

        def text = "122-144-2525" +
                "555-444-2125" +
                "555-444-212"
        def regex = "[0-9]{3}-[0-9]{3}-[0-9]{4}"
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
