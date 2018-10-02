package Staff.Management;

public class Director extends Manager {
    private double budget;

    public Director(String name, String nINumber, double salary, String deptName, double budget) {
        super(name, nINumber, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public double payBonus() {
        double bonusAmount = getSalary() * 0.02;
        return bonusAmount;
    } //not sure if this is correct?
}
