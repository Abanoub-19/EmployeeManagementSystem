package model;

public class MonthlyEmployee extends Employee {
    private double monthlySalary;

    public MonthlyEmployee(int id, String name, Gender gender, Department department,
                           double monthlySalary) {
        super(id, name, gender, department);
        setMonthlySalary(monthlySalary);
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary < 0) {
            throw new IllegalArgumentException("Monthly salary cannot be negative.");
        }
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}
