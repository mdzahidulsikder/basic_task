class Problem_10 {
    static void main(String[] args){

        /**
         * Problem 10 : Positive Lookbehind
         * You have a test String .
         Write a regex which can match all the occurences of digit which are immediately preceded by odd digit.
         () = group
         ? = o - more
         < = before
         */

        def scanner = new Scanner(System.in)
        String regex = "(?<=[13579])\\d"
        def inputText = scanner.nextLine()=~regex
        println("Match found: ")
            while (inputText.find()) {
                print("${inputText.group()}")
            }

    }
}
