class Problem_09 {
    static void main(String[] args) {
        /**
         Matching Character Ranges
         The string's length is >=5
         The first character must be a lowercase English alphabetic character.
         The second character must be a positive digit. Note that we consider zero to be neither positive nor negative.
         The third character must not be a lowercase English alphabetic character.
         The fourth character must not be an uppercase English alphabetic character.
         The fifth character must be an uppercase English alphabetic character.
         * */
        def text = "h4CkR"
        def regex = "^[a-z][123456789][^a-z][^A-Z][A-Z]"
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
