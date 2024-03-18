package RegexProblemHackerRank

class ProblemB {
    static void main(String[] args) {
        def scanner = new Scanner(System.in)
        def regex = "^[a-zA-Z]{0,}s\$"
        def inputText = scanner.nextLine() =~ regex
        if (inputText.find()) {
            println(true)
        } else {
            println(false)
        }
    }
}
