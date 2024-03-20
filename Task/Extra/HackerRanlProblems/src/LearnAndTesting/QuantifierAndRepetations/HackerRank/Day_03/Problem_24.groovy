/**
 * Negative lookbehind = not show before this condition
 *
 * You have a test String .
 Write a regex which can match all the occurences of characters which are not immediately preceded by vowels (a, e, i, u, o, A, E, I, O, U).
 */

def text = "1obs"

def regex = "(?<![aeiouAEIOU])."
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
