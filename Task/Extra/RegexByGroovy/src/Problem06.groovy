class Problem06 {
    static void main(String[] args) {
        /**
         *  Matching start and end
         *  ^ = starting position
         *  $ = end position
         *
         *  Xxxxx
         *  X = a digit
         *  x = word
         *  must start with a digit
         *  end with .
         *  total string = 6 character
         *
         */

        def scanner = new Scanner(System.in)
        def regex = "^\\d\\w{4}\\.\$"
        def inputText = scanner.nextLine() =~ regex
        if (inputText.find()) {
            println(true)
        } else {
            println(false)
        }


    }
}
