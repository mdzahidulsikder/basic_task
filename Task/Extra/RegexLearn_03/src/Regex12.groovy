class Regex12 {
    static void main(String[] args) {
        /**
         *  * = o or more
         *  ^ = start with
         *  $ = end with
         *  d = digit
         *  a- z = a to z in lowercase
         *  A-Z = A to Z in uppercase
         */

        def scanner = new Scanner(System.in)
        def regex = "^[\\d]{2,}[a-z]*[A-Z]*\$";
        def inputText = scanner.nextLine()=~regex
        if (inputText.findAll()){
            println(true)
        }else {
            println(false)
        }

    }
}
