class Problem02 {
    static void main(String[] args) {
        /**
         *  Problem05 : Matching Character Ranges
         *  a-z
         *  A-Z
         *  0-9
         *  The string's length is .
         The first character must be a lowercase English alphabetic character.
         The second character must be a positive digit. Note that we consider zero to be neither positive nor negative.
         The third character must not be a lowercase English alphabetic character.
         The fourth character must not be an uppercase English alphabetic character.
         The fifth character must be an uppercase English alphabetic character.
         */

        def scanner = new Scanner(System.in)
        def regex = "^[a-z][1-9][^a-z][^A-Z][A-Z]"
        def inputText = scanner.nextLine() =~ regex
        if (inputText.find()) {
            println(true)
        } else {
            println(false)
        }
    }
}
