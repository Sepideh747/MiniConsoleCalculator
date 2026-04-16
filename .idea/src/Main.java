import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        HistoryManager historyManager = new HistoryManager();

        while (true) {

            System.out.println("\n=== MINI CALCULATOR ===");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Show History");
            System.out.println("6. Exit");
            System.out.println("Choose Option: ");

            try {

                int choice = scanner.nextInt();

                if (choice == 6) {
                    System.out.println("Goodbye!");
                    break;
                }

                if (choice == 5) {
                    historyManager.printHistory();
                    continue;
                }

                System.out.print("Enter first number: ");
                double a = scanner.nextDouble();

                System.out.print("Enter second number: ");
                double b = scanner.nextDouble();

                double result = 0;
                String record = "";

                switch (choice) {

                    case 1:
                        result = calculator.add(a, b);
                        record = a + " + " + b + " = " + result;
                        break;

                    case 2:
                        result = calculator.substract(a, b);
                        record = a + " + " + b + " = " + result;
                        break;

                    case 3:
                        result = calculator.multiply(a, b);
                        record = a + " * " + b + " = " + result;
                        break;

                    default:
                        System.out.println("Invalid option.");
                        continue;
                }

                System.out.println("Result: " + result);
                historyManager.addRecord(record);

            } catch (ArithmaticException e) {
                System.out.println("Error: " + e.getMessage());

            } catch (Exception e) {
                system.out.println("Invalid inout. Please enter numbers oly.");
                scanner.nextline(); // clear input buffer
            }
        }
        scanner.close();
    }
}