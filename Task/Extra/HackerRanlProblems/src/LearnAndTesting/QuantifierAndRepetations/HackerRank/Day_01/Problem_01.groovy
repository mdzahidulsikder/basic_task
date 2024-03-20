package LearnAndTesting.QuantifierAndRepetations.HackerRank.Day_01

class Problem_01 {
     static void main(String[] args) {
         /**
          * regex = hackerrank
          */

         def text = "https://www.hackerrank.com"
         def regex = "hackerrank"
         def matcher = text =~ regex
         if (matcher){
             matcher.each {match ->
                 println("Match of your string:  $match")
             }
         }else {
             println("Not match")
         }

    }
}
