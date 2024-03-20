package LearnAndTesting.QuantifierAndRepetations.HackerRank.Day_02

class Problem_17 {
    static void main(String[] args) {
        /** ou have a test String .
         Your task is to write a regex which will match  with the following condition:
         should have  or more consecutive repetitions of ok.
         */

        def text = "okok-orokok\n" +
                "ok okokkonooK\n" +
                "KOKOKOKOKOKOKO\n" +
                "oookokokokokoko\n" +
                "okokokokokok\n" +
                "ok ok ok ok"

        def regex = "(ok){3,}"
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
