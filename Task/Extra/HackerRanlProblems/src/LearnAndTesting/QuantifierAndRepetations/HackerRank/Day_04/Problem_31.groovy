/**
 * problem : Forward References
 * You have a test string .
 Your task is to write a regex which will match string, with following condition(s):
 1. consists of tic or tac.
 2. tic should not be immediate neighbour of itself.
 3. The first tic must occur only when tac has appeared at least twice before.

 check: tactactic
 tactactictactic
 */

def text = "longisland"

def regex = "long(?=island)"
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

