class Problem_14 {
    static void main(String[] args) {

        /**
         * Write a RegEx to match a test string, S, under the following conditions:
         should consist of only lowercase and uppercase letters (no numbers or symbols).
         S should end in s.
         */
        def text = "es"
        def regex = "^[a-zA-Z]{0,}s\$"
        def matcher = text =~ regex
        if (matcher) {
            matcher.each { match ->
                println("Match of your string:  $match")
            }
        } else {
            println("Not found")
        }
    }
}

