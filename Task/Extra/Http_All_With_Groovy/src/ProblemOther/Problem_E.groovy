package ProblemOther

class Problem_E {
    static void main(String[] args) {
        def myNum = [3, 3, 4, 4, 5, 6, 3]
        def duplicateCheck = new int[myNum.size()]
        def ans = []

        myNum.each { num ->
            if (duplicateCheck[num] == 0) {
                ans.add(num)
                duplicateCheck[num] = 1
            }
        }

        ans.each { value ->
            print "$value "
        }
    }
}
