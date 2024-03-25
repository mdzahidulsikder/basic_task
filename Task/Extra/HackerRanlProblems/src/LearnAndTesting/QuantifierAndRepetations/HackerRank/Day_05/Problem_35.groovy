/**
 * Utopian Identification Number
 */

def scanner = new Scanner(System.in)
def n = scanner.nextInt()
scanner.nextLine()
def regex ="^[a-z]{0,3}\\d{2,8}[A-Z]{3,}\$"
(0..<n).each {
    def text = scanner.nextLine()
    if (text.matches(regex)){
        println("VALID")
    }else {
        println("INVALID")
    }
}