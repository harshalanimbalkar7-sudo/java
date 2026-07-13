import java.util.Scanner;

public class hello {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String firstName = sc.next();

        System.out.print("Enter Last Name: ");
        String lastName = sc.next();

        System.out.print("Enter Weight (in kg): ");
        double weight = sc.nextDouble();

        System.out.print("Enter Height (in meters): ");
        double height = sc.nextDouble();

        double bmi = weight / (height * height);

        System.out.println("\n----- BMI DETAILS -----");
        System.out.println("Name : " + firstName + " " + lastName);
        System.out.println("Weight : " + weight + " kg");
        System.out.println("Height : " + height + " m");
        System.out.printf("BMI : %.2f", bmi);

        sc.close();
    }
}