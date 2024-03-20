/**
 * Problem : Matching Same Text Again & Again
 *
 */


def text = "ab +5+ZaEfab +5+ZaEf"

def regex = "^([a-z])(\\w)(\\s)(\\W)(\\d)(\\D)([A-Z])([a-zA-Z])([aeiouAEIOU])(\\S)\\1\\2\\3\\4\\5\\6\\7\\8\\9\\10\$"
def matcher = text =~ regex
if (matcher) {
    int i = 1
    matcher.each { match ->
        println("$i. Match of your string:  ${match[0]}")
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
