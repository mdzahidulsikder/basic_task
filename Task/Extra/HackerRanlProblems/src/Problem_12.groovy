class Problem_12 {
    static void main(String[] args) {
        def text = "221231231vacmascvamsvcASCAXA"
        def regex = "^[0-9]{2,}[a-z]*[A-Z]*\$"
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
