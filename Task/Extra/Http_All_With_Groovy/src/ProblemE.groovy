class ProblemE {
    static void main(String[] args) {
        def myNum = [3, 3, 4, 4, 5, 6, 3]
        def duplicateCheck = [:]
        def ans = []
        myNum.each { num ->
            if (!duplicateCheck.containsKey(num)) {
                ans.add(num)
                duplicateCheck[num] = true
            }
        }

        ans.each { value ->
            print "$value "
        }
    }
}
