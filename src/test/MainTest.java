package test;

import model.CommissionEmployee;
import model.Department;
import model.Gender;
import model.HourlyEmployee;
import model.MonthlyEmployee;

public class MainTest {
    public static void main(String[] args) {
        Department it = new Department("IT");

        MonthlyEmployee monthly = new MonthlyEmployee(
                1, "Mona Ali", Gender.FEMALE, it, 12000
        );

        CommissionEmployee commission = new CommissionEmployee(
                2, "Omar Samir", Gender.MALE, it, 50000, 0.10
        );

        HourlyEmployee hourly = new HourlyEmployee(
                3, "Nour Ahmed", Gender.OTHER, it, 160, 75
        );

        System.out.println("=== Monthly Employee ===");
        monthly.displayInfo();

        System.out.println("\n=== Commission Employee ===");
        commission.displayInfo();

        System.out.println("\n=== Hourly Employee ===");
        hourly.displayInfo();
    }
}
