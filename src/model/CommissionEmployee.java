package model;

public class CommissionEmployee extends Employee {
    private double sales;
    private double commissionRate;

    public CommissionEmployee(int id, String name, Gender gender, Department department,
                              double sales, double commissionRate) {
        super(id, name, gender, department);
        setSales(sales);
        setCommissionRate(commissionRate);
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        if (sales < 0) {
            throw new IllegalArgumentException("Sales cannot be negative.");
        }
        this.sales = sales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    // Example: 0.10 means 10%.
    public void setCommissionRate(double commissionRate) {
        if (commissionRate < 0 || commissionRate > 1) {
            throw new IllegalArgumentException("Commission rate must be between 0 and 1.");
        }
        this.commissionRate = commissionRate;
    }

    @Override
    public double calculateSalary() {
        return sales * commissionRate;
    }
}
