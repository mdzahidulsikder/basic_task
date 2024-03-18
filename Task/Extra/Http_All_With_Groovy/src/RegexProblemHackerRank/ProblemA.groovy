package RegexProblemHackerRank

class ProblemA {
    static void main(String[] args) {
        def scanner = new Scanner(System.in)
        def regex = "^\\d{1,2}[A-Za-z]{3,}\\.{0,3}\$"
        def inputText = scanner.nextLine() =~ regex
        if (inputText.find()) {
            println(true)
        } else {
            println(false)
        }

    }
}
