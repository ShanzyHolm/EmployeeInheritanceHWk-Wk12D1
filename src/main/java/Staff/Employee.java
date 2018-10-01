package Staff;

public abstract class Employee {

    private String name;
    private int nINumber;
    private double salary;

    public Employee(String name, int nINumber, double salary) {
        this.name = name;
        this.nINumber = nINumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getnINumber() {
        return nINumber;
    }

    public void setnINumber(int nINumber) {
        this.nINumber = nINumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void raiseSalary(double salary) {

    }

    public void payBonus() {

    }
}
