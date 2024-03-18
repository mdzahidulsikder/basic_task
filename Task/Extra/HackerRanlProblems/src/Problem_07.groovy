class Problem_07 {
    static void main(String[] args) {
        /**
         Matching Specific Characters
         must be of length: 6
         First character: 1, 2 or 3
         Second character: 1, 2 or 0
         Third character: x, s or 0
         Fourth character: 3, 0 , A or a
         Fifth character: x, s or u
         Sixth character: . or ,
         * */
        def text = "1203x."
        def regex = "^[1-3][0-2][xs0][30Aa][xsu][.,]\$"
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
