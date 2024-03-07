class Problem03 {
    static void main(String[] args) {

        // regex for like this : 00A11B7777
        // 2 digit + 1 char + 2 digit + 1 char + 4 digit


        def scanner = new Scanner(System.in)
        def regex = "\\d{2}\\D\\d{2}\\D\\d{4}"
        def inputText = scanner.nextLine() =~ regex
        if (inputText.find()) {
            println(true)

        } else {
            println(false)
        }


    }
}
