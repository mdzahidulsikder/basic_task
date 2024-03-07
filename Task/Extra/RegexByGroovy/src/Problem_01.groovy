import java.util.regex.Pattern

class Problem_01 {
    static void main(String[] args) {
        def scanner = new Scanner(System.in)
        def inputText = scanner.nextLine()
        def regex = "hackerrank";
        def pattern = Pattern.compile(regex)
        def matcher = pattern.matcher(inputText)
        def count = 0;
        while (matcher.find()) {
            count++
        }
        println("Value : "+ count)


//        def scanner = new Scanner(System.in)
//        def regex = "wikipedia"
//        def inputText = scanner.nextLine() =~ regex
//        def count = 0;
//        while (inputText.find()){
//            count++
//        }
//        println("Value : "+ count)




    }
}
