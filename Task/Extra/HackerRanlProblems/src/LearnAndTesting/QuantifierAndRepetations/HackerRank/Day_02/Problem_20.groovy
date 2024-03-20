package LearnAndTesting.QuantifierAndRepetations.HackerRank.Day_02

class Problem_20 {
    static void main(String[] args) {
        /**
         * Branch Reset Groups
         *
         12-34-56-78
         12:34:56:78
         12---34---56---78
         12.34.56.78
         *
         */

        def text = "12-34-56-78"


        def regex = "^[0-9]{2}(-|:|---|\\.){1}[0-9]{2}\\1[0-9]{2}\\1[0-9]{2}\$"
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
