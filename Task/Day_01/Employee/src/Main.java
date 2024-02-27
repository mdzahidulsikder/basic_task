//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Employee[] employees = new Employee[4];
        employees[0] = new Manager("Zahidul Sikder", 15000, 1000);
        employees[1] = new Manager("Aoritro Das", 15000, 1000);

        employees[2] = new Worker("Tajnur", 5000);
        employees[3] = new Worker("Roman", 10000);

        double totalSalary = 0;
        for (Employee emp : employees) {
            if (emp instanceof Manager manager) {
                totalSalary += manager.totalSalary();
            } else {
                totalSalary += emp.getSalary();
            }
        }
        System.out.println("Total Salary of Employee : " + totalSalary);


    }
}