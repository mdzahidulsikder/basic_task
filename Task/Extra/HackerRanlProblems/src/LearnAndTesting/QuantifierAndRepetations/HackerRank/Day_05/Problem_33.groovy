
def scanner = new Scanner(System.in)
def n = scanner.nextInt()
scanner.nextLine()

def regex ="(\\d{1,3})[ -](\\d{1,3})[ -](\\d{4,10})"
(0..<n).each {
    def text = scanner.nextLine()
    def matcher = text =~ regex
    if (matcher) {
        def countryCode = matcher.group(1)
        def localAreaCode= matcher.group(2)
        def phoneNumber = matcher.group(3)
        println("CountryCode=$countryCode,LocalAreaCode=$localAreaCode,Number=$phoneNumber")
    }
}