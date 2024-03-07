class Problem08 {
    static void main(String[] args) {
        /**
         *  Problem05 : Matching {x} Repetitions
         *  w{3} = www
         *  [xyz]{5} = [xyz][xyz][xyz][xyz][xyz]
         *  \d{4} = [0-9]  [0-9]  [0-9]  [0-9]
         *  ^[a-zA-Z24680]{40}[13579|\\s]{5}$
         *  example : 2222222222aaaaaaaaaa2222222222aaaaaaaaaa13 57
         */

        def scanner = new Scanner(System.in)
        def regex = "^[a-zA-Z24680]{40}[13579|\\s]{5}\$"
        def inputText = scanner.nextLine() =~ regex
        if (inputText.find()) {
            println(true)
        } else {
            println(false)
        }


    }
}
