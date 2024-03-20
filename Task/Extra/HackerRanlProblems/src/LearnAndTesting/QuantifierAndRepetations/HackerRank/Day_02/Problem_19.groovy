package LearnAndTesting.QuantifierAndRepetations.HackerRank.Day_02

class Problem_19 {
    static void main(String[] args) {
        /**
         * Backreferences To Failed Groups
         *
         */

        def text = "12-34-56-78"

        def regex = "^\\d{2}(-?)(\\d{2}\\1){2}\\d{2}\$"
        def matcher = text =~ regex
        if (matcher) {
            int i = 1
            matcher.each { match ->
                println("$i. Match of your string:  $match --->" + true)
                i++
            }
        } else {
            println("Not match ")
        }


        if (matcher) {
            println(true)
        } else {
            println(false)
        }
    }
}
