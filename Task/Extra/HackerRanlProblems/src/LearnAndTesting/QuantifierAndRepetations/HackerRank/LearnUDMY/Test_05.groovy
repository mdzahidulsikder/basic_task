package LearnAndTesting.QuantifierAndRepetations.HackerRank.LearnUDMY

class Test_05 {
    static void main(String[] args) {
        /**
         * regex =
         * {3} = length = 3 time
         * {3,} = length = 3 to infinite
         * {lower, upper}
         * */

        def text = "Johnson-SSN-059754623-DOB-1994\n" +
                "Peter-SSN-657448762-DOB-1998\n"+
                "Peter-SSN-657448762-DOB-199"

        def regex = "\\w+-SSN-\\d{9}-DOB-\\d{4}"
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
