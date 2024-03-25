/**
 * problem : Saying Hi
 *
 1. The first character must be the letter H or h .
 2. The second character must be the letter I or i.
 3. The third character must be a single space (i.e.:\s).
 4. The fourth character must not be the letter D or d.
 */

def scanner = new Scanner(System.in)
def n = scanner.nextInt()
scanner.nextLine()
def regex ="^[Hh][Ii]\\s[^Dd].*\$"

(0..<n).each {
    def text = scanner.nextLine()
    def matcher = text =~regex
    if (matcher){
        matcher.each {match ->
            println(match)
        }
    }
}