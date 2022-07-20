package staff.management;

public class Director extends Manager{
    private double budget;

    public Director(String name, int niNum, int salary, String deptName, double budget) {
        super(name, niNum, salary, deptName);
        this.budget = budget;
    }

    public double getBudget(){
        return this.budget;
    }

    public double getBonus() {
        return salary * 0.02;
    }


}
