package LearnAndTesting.QuantifierAndRepetations.ByJava.HackerRank;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern ;
import java.util.regex.Matcher ;
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        String bf = in.nextLine();
        String s = in.nextLine() ;
        String pattern = "^[0-9]{2}(-|:|---|\\.){1}[0-9]{2}\\1[0-9]{2}\\1[0-9]{2}$";
        Pattern pat  = Pattern.compile(pattern) ;
        Matcher matcher = pat.matcher(s) ;
        boolean match = matcher.find() ;
        if(match)
        {
            System.out.println("true") ;
        }
        else
        {
            System.out.println("false") ;
        }
    }
}






//import java.io.*;
//        import java.util.*;
//        import java.text.*;
//        import java.math.*;
//        import java.util.regex.*;
//
//public class Solution {
//
//    public static void main(String[] args) {
//
//        Regex_Test tester = new Regex_Test();
//        tester.checker("__________"); //Use '\\' instead of '\'.
//
//    }
//}
//
//class Regex_Test {
//
//    public void checker(String Regex_Pattern){
//
//        Scanner Input = new Scanner(System.in);
//        String Test_String = Input.nextLine();
//        Pattern p = Pattern.compile(Regex_Pattern);
//        Matcher m = p.matcher(Test_String);
//        int Count = 0;
//        while(m.find()){
//            Count += 1;
//        }
//        System.out.format("Number of matches : %d",Count);
//    }
//
//}





