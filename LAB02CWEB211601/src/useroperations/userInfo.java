package useroperations;
import java.util.Scanner;

public class userInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input user information
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter your hobby: ");
        String hobby = scanner.nextLine();


        User user = new User(name, age);
        user.setHobby(hobby);


        System.out.println("\nDisplaying basic info:");
        user.displayInfo();

        System.out.println("\nDisplaying info with hobby:");
        user.displayInfo(hobby);


        int yearsToRetirement = 65 - age;
        System.out.println("\nDisplaying info with years to retirement:");
        user.displayInfo(yearsToRetirement);

        scanner.close();
    }
}
