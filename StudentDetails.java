import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for student name
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        // Prompt user for student ID
        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();

        System.out.println("Enter student phone number:");
        String number =  scanner.nextLine();

        System.out.println("Enter student address");
        String address = scanner.nextLine();

        // Display the entered details
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("phone Number" +number);
        System.out.println("address:" +address)

        scanner.close();
    }
}
