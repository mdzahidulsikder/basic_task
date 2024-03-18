class Problem_13 {
    static void main(String[] args) {
        def text = "123QWRasd"
        def regex = "^[0-9]+[A-Z]+[a-z]+\$"
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
