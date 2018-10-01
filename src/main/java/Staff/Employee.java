package Staff;

public abstract class Employee {

    private String name;
    private String nINumber;
    private double salary;

    public Employee(String name, String nINumber, double salary) {
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

    public String getNINumber() {
        return nINumber;
    }

    public void setNINumber(String nINumber) {
        this.nINumber = nINumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double raiseSalary() {
        double newSalary = this.salary + 1;
        return newSalary;
    } //not sure if this is correct?

    public double payBonus() {
        double bonusAmount = getSalary() * 0.01;
        return bonusAmount;
    } //not sure if this is correct?
}
