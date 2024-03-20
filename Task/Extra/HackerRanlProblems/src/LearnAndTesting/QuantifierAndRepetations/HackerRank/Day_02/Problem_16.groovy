package LearnAndTesting.QuantifierAndRepetations.HackerRank.Day_02

class Problem_16 {
    static void main(String[] args) {



        def text = "Found any match?"

        def regex = "\\b[aeiouAEIOU][a-zA-Z]*\\b"
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


        if (matcher){
            println(true)
        }else {
            println(false)
        }
    }
}
