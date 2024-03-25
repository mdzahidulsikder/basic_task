def scanner = new Scanner(System.in)
def n = scanner.nextInt()
scanner.nextLine()
def regex ="^[A-Z]{5}\\d{4}[A-Z]\$"
(0..<n).each {
    def text = scanner.nextLine()
    if (text.matches(regex)){
        println("YES")
    }else {
        println("NO")
    }
}