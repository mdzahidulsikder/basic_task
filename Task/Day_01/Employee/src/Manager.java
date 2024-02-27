public class Manager extends Employee{
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public Manager(double bonus) {
        this.bonus = bonus;
    }

    public double  totalSalary(){

        double  totalSalary = bonus+getSalary() ;

        return totalSalary;
    }
}
