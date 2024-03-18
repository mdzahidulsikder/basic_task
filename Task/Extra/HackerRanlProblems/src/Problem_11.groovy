class Problem_11 {
    static void main(String[] args) {

        def text = "3threeormorealphabets."
        def regex = "^[0-9]{1,2}[a-zA-Z]{3,}[\\.]{0,3}\$"
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
