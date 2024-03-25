/**
 *
 *
 *
 * .464482647584728129464ZYkCEDGpNCIAaWfoc_
 _9890113543788890127146858038YTI
 _488538848711793736RRZ.
 */

def scanner = new Scanner(System.in)

def n = scanner.nextInt()
def regex = "^([_|.])[0-9]+[a-zA-Z]*_?\$"
scanner.nextLine()

(1..n).each {
    def text = scanner.nextLine()
    scanner.nextLine()
    def matcher = text =~regex
    if (matcher){
        matcher.each {match ->
            println("VALID")
        }
    }else{
        println("INVALID")
    }
}

