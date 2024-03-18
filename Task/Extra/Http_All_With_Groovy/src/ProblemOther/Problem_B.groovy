package ProblemOther

class Problem_B {
    /**
     * if latter , letter == false
     * if abcd, dbca == true
     */

    static void main(String[] args) {

        def scanner = new Scanner(System.in)
        println("Input your First String: ")
        String strA = scanner.next().toLowerCase().replaceAll(" ", "")
        println("Input your Second String: ")
        String strB = scanner.next().toLowerCase().replaceAll(" ", "")

        def ans = true
        def map = [:]
        strA.each { charA -> map[charA] = 1 }
        strB.each { charB ->
            if (!map.containsKey(charB)) {
                ans = false
            }
        }
        println(ans)

    }
}
