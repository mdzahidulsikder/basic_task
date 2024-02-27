public class Worker extends Employee{


    public Worker() {
    }

    public Worker(String name, double salary) {
        super(name, salary);
    }

    public double  totalSalary(){
        return getSalary();
    }
}
