import java.util.ArrayList;
import java.util.List;

public class Employee {
    private int employeeId;
    private String name;
    private String position;
    private double basicSalary;
    private double overtimeHours;
    private double bonus;
    private double deductions;

    public Employee(int employeeId, String name, String position, double basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.basicSalary = basicSalary;
    }

    public double getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getDeductions() {
        return deductions;
    }

    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }

    public double calculateSalary() {
        double overtimePay = overtimeHours * (basicSalary / 40); // Assuming 40 hours per week
        double totalSalary = basicSalary + overtimePay + bonus - deductions;
        return totalSalary;
    }

    private List<PaymentEntry> paymentHistory = new ArrayList<>();

    public void addPaymentEntry(double amount, String description) {
        PaymentEntry paymentEntry = new PaymentEntry(amount, description);
        paymentHistory.add(paymentEntry);
    }

    // Method to retrieve the payment history
    public List<PaymentEntry> getPaymentHistory() {
        return paymentHistory;
    }

    static class PaymentEntry {
        private double amount;

        private String description;

        public PaymentEntry(double amount, String description) {
            this.amount = amount;
            this.description = description;
        }

        public String getDescription() {
            return null;
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }

    }
}
