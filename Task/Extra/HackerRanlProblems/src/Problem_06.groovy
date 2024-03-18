class Problem_06 {
    static void main(String[] args) {
        /**
         Matching Start & End
         * */
        def text = "0qwer."
        def regex = "^\\d\\w{4}.\$"
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
