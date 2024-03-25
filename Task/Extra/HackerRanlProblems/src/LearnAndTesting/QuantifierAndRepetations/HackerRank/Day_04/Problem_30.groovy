/**
 * problem : HackerRank Tweets
 * match :  hackerrank ignore case
 */

def scanner = new Scanner(System.in)
def regex = "[#@\\s]?[hH][aA][cC][Kk][eE][rR][rR][aA][nN][kK]"
def n = scanner.nextInt()
scanner.nextLine()
def count =0
(0..<n).each {
    def text = scanner.nextLine()
    def match = text =~regex
    if (match){
        count++
    }
}
println(count)