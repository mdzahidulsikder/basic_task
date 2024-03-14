class ProblemB {
    static void main(String[] args) {
        def scanner = new Scanner(System.in)
        println("Input your First String: ")
        String strA = scanner.next().toLowerCase().replaceAll(" ","")
        println("Input your Second String: ")
        String strB = scanner.next().toLowerCase().replaceAll(" ", "")

        int count = 0

        for (int i = 0; i<strB.length(); i++){
            for (int j = 0; j<strA.length(); j++){
                if (strB.charAt(i) == strA.charAt(j)){
                    count++
                    break
                }
            }
        }

        if (count == strB.length()){
            println("True")
        }else {
            println("False")
        }


    }
}
