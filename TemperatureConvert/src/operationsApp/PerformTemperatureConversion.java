package operationsApp;


import java.util.Scanner;
import operationsLibrary.TemperatureConverter;

public class PerformTemperatureConversion {

    private Scanner scanner = new Scanner(System.in);

    public void start() {
        int choice = 0;
        while (choice != 3) {
            displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
            case 1:
                performCelsiusToFahrenheit();
                break;
            case 2:
                performFahrenheitToCelsius();
                break;
            case 3:
                System.out.println("Exiting application. Goodbye!");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
            }
            System.out.println();
        }
        scanner.close();
    }

    private void displayMenu() {
        System.out.println("--- Temperature Conversion Menu ---");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Exit");
    }

    private void performCelsiusToFahrenheit() {
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = TemperatureConverter.celsiusToFahrenheit(celsius);
        System.out.println(celsius + "°C is equal to " + fahrenheit + "°F");
    }



    private void performFahrenheitToCelsius() {
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = TemperatureConverter.fahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + "°F is equal to " + celsius + "°C");
    }
}
