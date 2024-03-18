class Problem_04 {
    static void main(String[] args) {
        /**
         * Matching Whitespace & Non-Whitespace Character
         * XXxXXxXX
         * x = whitespace
         * X = non white space
         *
         * */
        def text = "12 11 15"
        def regex = "\\S{2}\\s\\S{2}\\s\\S{2}"
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
