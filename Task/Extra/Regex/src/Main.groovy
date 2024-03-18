class Main {
    static void main(String[] args) {
//        def text = "Some\u0003text"  // Unicode representation of control character ETX
//        def pattern = /\u0003/       // Regular expression pattern to match ETX
//
//        def matcher = text =~ pattern
//
//        if (matcher) {
//            println "Match found: ${matcher[0]}"
//        } else {
//            println "No match found"
//        }


//        def text = "Some\\x03text"  // This is equivalent to "Some\u0003text"
//        def pattern = /[\x03]/     // Regular expression pattern to match the character with hexadecimal code 03
//
//        def matcher = text =~ pattern
//
//        if (matcher) {
//            println "Match found: ${matcher[0]}"
//        } else {
//            println "No match found"
//        }


        /**
         * Lookahead assertion = ?=
         * example = (?= [v|V]alue)
         */

        def text = "The Value is Rs 500\n" +
                "The value is Rs45877\n" +
                "The 94500 is the value"

        def pattern = /(?<=The [vV]alue)/

        def matcher = text =~ pattern

        if (matcher) {
            matcher.each { match ->
                println "Match found: ${match[0]}"
            }
        } else {
            println "No match found"
        }












//        def text = "The Value is Rs 500\n" +
//                "The value is Rs45877\n" +
//                "The 94500 is the value"
//
//        /**
//         * look behind = ?<
//         */
//
//        def pattern = /(?=The [vV]alue is\s)(.*)/
//
//        def matcher = text =~ pattern
//
//        if (matcher) {
//            matcher.each { match ->
//                println "Match found: ${match[0]}"
//            }
//        } else {
//            println "No match found"
//        }





    }
}
