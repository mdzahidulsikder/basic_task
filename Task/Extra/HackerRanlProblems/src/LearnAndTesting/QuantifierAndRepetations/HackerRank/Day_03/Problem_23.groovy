/**
 * positive lookahead = ?<=
 * problem = find any number if before an odd number
 */


def text = "016480231"

def regex = "(?<=[13579])\\d"
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
