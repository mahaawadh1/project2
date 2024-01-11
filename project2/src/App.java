import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee ID:");
        int employeeId = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Employee Name:");
        String employeeName = scanner.nextLine();

        System.out.println("Enter Employee Position:");
        String employeePosition = scanner.nextLine();

        System.out.println("Enter Employee Total Salary:");
        double totalSalary = scanner.nextDouble();

        Employee employee = new Employee(employeeId, employeeName, employeePosition, totalSalary);

        System.out.println("Enter Payment History :");

        while (true) {

            System.out.println("Enter Payment Amount:");
            double paymentAmount = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Enter Payment Description:");
            String paymentDescription = scanner.nextLine();

            employee.addPaymentEntry(paymentAmount, paymentDescription);

            System.out.println("Do you want to add another payment? yes or no");
            String choice = scanner.nextLine().toLowerCase();
            if (!choice.equals("yes")) {
                break;
            }
        }

        double calculatedSalary = employee.calculateSalary();
        System.out.println("\nTotal Salary: $" + calculatedSalary);

        System.out.println("\nPayment History:");
        for (Employee.PaymentEntry entry : employee.getPaymentHistory()) {
            System.out.println(entry.getDescription() + ": KWD" + entry.getAmount());
        }

        scanner.close();
    }
}
