class Assertion {
    static void main(String[] args) {
        /**
         * Lookahead assertion, lookahead : ?=
         * find the text before this regex patter
         *
         */

//        def text = "The Value is Rs 500\n" +
//                "The value is Rs45877\n" +
//                "The 94500 is the value"
//
//        def pattern = /.*(?=is the value)/
//
//        def matcher = text =~ pattern
//
//        if (matcher) {
//            matcher.each { match ->
//                println "Match found: ${match}"
//            }
//        } else {
//            println "No match found"
//        }




        /**
         * Lookahead assertion : ?!= or ?<!
         * looking bill , where not paid written
         */

        //1
//        def text = "bill paid\n" +
//                "bill not paid\n" +
//                "bill paid\n" +
//                "bill not paid"
//
//        def pattern = /bill(?!\spaid)/
//
//        def matcher = text =~ pattern
//
//        if (matcher) {
//            matcher.each { match ->
//                println "Match found: ${match}"
//            }
//        } else {
//            println "No match found"
//        }

        /**
         * 2. Negative lookahead
         * ?!= or ?<!
         *  find all without USD
         */

//        def text = "100 USD\n" +
//                "250 JPY\n" +
//                "900 ITL\n" +
//                "750 YUA"
//
//        def pattern = /\d{3}(?!\sUSD).*/
//
//
//        def matcher = text =~ pattern
//        if (matcher){
//            matcher.each {match ->
//                println "Match found: ${match}"
//            }
//        }else {
//            println("No match found")
//        }










        /**
          * look behind = ?<=
         * find after this pattern
         * output will show after this regex
        */


//        def text = "The Value is Rs 500\n" +
//                "The value is Rs45877\n" +
//                "The 94500 is the value"
//
//
//
//        def pattern = /(?<=The [vV]alue is\s)(.*)/
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


        /**
         * Once-only Subexpression= ?<=
         * find after this pattern
         * output will show  this regex + next word
         */


//        def text = "abc The Value is Rs 500\n" +
//                "abc The value is Rs45877\n" +
//                "abc The 94500 is the value"
//
//
//
//        def pattern = /(?>The [vV]alue is\s)/
//
//        def matcher = text =~ pattern
//
//        if (matcher) {
//            matcher.each { match ->
//                println "Match found: ${match}"
//            }
//        } else {
//            println "No match found"
//        }


     //   (?(?=h)hat|(cat|rat))

        /**
         * Condition [if then else]= ?()
         * find after this pattern
         * output will show  this regex + next word
         */


        def text = "hat\n" +
                "bat\n" +
                "cat\n" +
                "rat"

        def pattern = /(hat)|(cat|rat)/

        def matcher = text =~ pattern

        if (matcher) {
            matcher.each { match ->
                def result = match[1] != null ? match[1] : match[2]
                println "Match found: ${result}"
            }
        } else {
            println "No match found"
        }





    }
}
