class Problem_10 {
    static void main(String[] args) {
        /**
         You have a test string S.
         Your task is to write a regex that will match
         using the following conditions:

         S must be of length equal to 45.
         The first 40 characters should consist of letters(both lowercase and uppercase), or of even digits.
         The last 5 characters should consist of odd digits or whitespace characters.
         * */
        def text = "2222222222aaaaaaaaaa2222222222aaaaaaaaaa13 57"
        def regex = "^[a-zA-Z24680]{40}[13579\\s]{5}\$"
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
