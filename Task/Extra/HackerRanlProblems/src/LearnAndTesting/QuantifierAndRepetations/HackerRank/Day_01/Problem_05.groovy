package LearnAndTesting.QuantifierAndRepetations.HackerRank.Day_01

class Problem_05 {
    static void main(String[] args) {
        /**
         Matching Word & Non-Word Character
         \w = character , underscore, digit
         * */
        def text = "www.hackerrank.com"
        def regex = "\\w{3}\\W\\w{10}\\W\\w{3}"
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
