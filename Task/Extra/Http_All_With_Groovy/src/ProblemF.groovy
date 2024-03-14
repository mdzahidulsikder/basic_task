class ProblemF {
    static void main(String[] args) {

        def charCount = [:]
      println("Enter the word: ")
        def word = System.in.newReader().readLine() as String


        for (int i = 0; i <word.size(); i++){
            def character = word[i]
            if (charCount.containsKey(character)){
                charCount[character]++
            }else {
                charCount[character] = 1
            }
        }


        for (entry in charCount.entrySet()){
            def character = entry.key
            def count = entry.value
            println("$character Occurence : $count")
        }




    }
}
