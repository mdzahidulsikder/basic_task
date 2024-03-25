def scanner = new Scanner(System.in)
def n = scanner.nextInt()
scanner.nextLine()

def ip4Reg = "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\$"
def ip6Reg ="^([0-9a-f]{1,4}:){7}[0-9a-f]{1,4}\$"

(0..<n).each {
    def text = scanner.nextLine()
    if (text.matches(ip4Reg)){
        println("IPv4")
    }else if (text.matches(ip6Reg)){
        println("IPv6")
    }else {
        println("Neither")
    }
}