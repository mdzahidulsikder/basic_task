class Problem04 {
    static void main(String[] args) {
        /**
         *  Problem04 : White space and non white space count
         *  XXxXXxXX
         *  x = white space
         *  X = non white space
         *  2 non white space + 1 white space + 2 non white space + 1 white space + 2 non white space
         */

        def scanner = new Scanner(System.in)
        def regex = "\\S{2}\\s\\S{2}\\s\\S{2}"
        def inputText = scanner.nextLine() =~ regex
        if (inputText.find()) {
            println(true)
        } else {
            println(false)
        }


    }
}
