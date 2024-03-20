/**
 * Problem : Negative Lookahead
 * you have a test String s.
 Write a regex which can match all characters which are not immediately followed by that same character.
 Example If  = goooo, then regex should match goooo. Because the first g is not follwed by g and the last o is not followed by o.
 */

def text = "goooo"

def regex = "(.)(?!\\1)"
def matcher = text =~ regex
if (matcher) {
    int i = 1
    matcher.each { match ->
        println("$i. Match of your string:  $match")
        i++
    }
} else {
    println("Not match ")
}

if (matcher) {
    println(true)
} else {
    println(false)
}
