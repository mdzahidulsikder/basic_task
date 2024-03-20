/**
 * problem = Matching Word Boundaries
 * You have a test String .
 Your task is to write a regex which will match word starting with vowel (a,e,i,o, u, A, E, I , O or U).
 The matched word can be of any length. The matched word should consist of letters (lowercase and uppercase both) only.
 The matched word must start and end with a word boundary.
 */

def text = "Found any match?"

def regex = "\\b[aeiouAEIOU][a-zA-Z\\W]+\\b"
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
