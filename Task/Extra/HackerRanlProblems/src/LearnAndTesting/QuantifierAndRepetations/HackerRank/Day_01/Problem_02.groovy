package LearnAndTesting.QuantifierAndRepetations.HackerRank.Day_01

class Problem_02 {
    static void main(String[] args) {
        /**
         * Matching Anything But a Newline
         * You have a test string S.
         * Your task is to match the pattern abc.def.ghi.jkx, and only exact strings that follow this pattern
         * where each variable a,b,c,d,e,f,g,h,i,j,k,x can be any single character except the newline.
         */
        def text = "123.456.abc.def"
        def regex = "^...\\....\\....\\....\$"
        def matcher = text =~ regex
        if (matcher){
            matcher.each {match ->
                println("Match of your string:  $match")
            }
        }
        else {
            println("Not found")
        }
    }
}
