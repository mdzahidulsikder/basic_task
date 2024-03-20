package LearnAndTesting.QuantifierAndRepetations.HackerRank.Day_02

class Problem_18 {
    static void main(String[] args) {

        /**
         * Given a test string, , write a RegEx that matches  under the following conditions:

        s must start with Mr., Mrs., Ms., Dr. or Er..
         The rest of the string must contain only one or more English alphabetic letters (upper and lowercase).
         */

        def text = "Mr.VKDoshi."

        def regex = "^(Mr\\.|Mrs\\.|Ms\\.|Dr\\.|Er\\.)[a-zA-Z]+\$"
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
