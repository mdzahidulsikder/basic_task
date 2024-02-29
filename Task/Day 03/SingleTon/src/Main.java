//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Logger first_Logger = Logger.getInstance();
        first_Logger.logMessage("Singleton is working ");

        Logger second_Logger = Logger.getInstance();
        second_Logger.logMessage("Design is working");

        Logger third_Logger = Logger.getInstance();
        third_Logger.logMessage("Pattern is working");
        System.out.println(".................Checking instance.....................");

        if (first_Logger == second_Logger && second_Logger == third_Logger){
            System.out.println("First hasCode = " +first_Logger+",\nSecond hashCode = " + second_Logger + " and \nthird hasCode = "+third_Logger + ",\nthat are same"   );
        }else {
            System.out.println("Instances are not same");
        }

    }

}
