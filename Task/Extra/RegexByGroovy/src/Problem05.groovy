class Problem05 {
    static void main(String[] args) {
        /**
         *  Problem05 : Match word and non word
         *  xxxXxxxxxxxxxxXxxx
         * \w = word character (a-z, A-Z, 0-9, _
         * \W = non - word
         */

        def scanner = new Scanner(System.in)
        def regex = "\\w{3}\\W\\w{10}\\W\\w{3}"
        def inputText = scanner.nextLine() =~ regex
        if (inputText.find()) {
            println(true)
        } else {
            println(false)
        }


    }
}
