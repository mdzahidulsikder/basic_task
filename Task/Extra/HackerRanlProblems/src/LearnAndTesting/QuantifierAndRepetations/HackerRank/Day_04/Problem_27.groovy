/**
 * Detect HTML Tags
 * The first line contains all tag names:
 * he second line contains all  tag names: .
 *  Our set of unique tag names
 * When we order these alphabetically and print them as semicolon-separated
 */

def scanner = new Scanner(System.in)
println("How many html line you have: ")
def n = scanner.nextInt()
scanner.nextLine()
def regex = "<\\s*?(\\w+)"
def tagNames = new TreeSet<>()

(0..<n).each {
    println("${it + 1} Input your html tag")
    def fragment = scanner.nextLine()
    def matcher = fragment =~ regex
    if (matcher) {
        matcher.each {
            match -> tagNames.add(match[1])
        }
    }
}
if (tagNames.size() > 0) {
    println(tagNames.join(";"))
} else {
    println("No tag found")
}