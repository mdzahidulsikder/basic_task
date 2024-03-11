class Problem_11 {
    static void main(String[] args) {
        /**
         * Problem 11 = negative lookbehind
         * ? = o or more
         * < before
         * ! = negative value = not like
         *You have a test String .
         Write a regex which can match all the occurences of characters which are not immediately preceded by vowels (a, e, i, u, o, A, E, I, O, U).
         */

        def  scanner = new Scanner(System.in)
        def regex = "(?<![aeiouAEIOU])[\\S]"
        def  inputText = scanner.nextLine()=~regex
        while (inputText.find()){
            print("${inputText.group()}")
        }
    }
}
