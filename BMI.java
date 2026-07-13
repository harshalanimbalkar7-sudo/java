// import java.util.Scanner;

// public class BMI {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter First Name: ");
//         String firstName = sc.next();

//         System.out.print("Enter Last Name: ");
//         String lastName = sc.next();

//         System.out.print("Enter Weight (in kg): ");
//         double weight = sc.nextDouble();

//         System.out.print("Enter Height (in meters): ");
//         double height = sc.nextDouble();

//         double bmi = weight / (height * height);

//         System.out.println("\n----- BMI DETAILS -----");
//         System.out.println("Name : " + firstName + " " + lastName);
//         System.out.println("Weight : " + weight + " kg");
//         System.out.println("Height : " + height + " m");
//         System.out.printf("BMI : %.2f", bmi);

//         sc.close();
//     }
// }


import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("\nArithmetic Operations:");
        System.out.println("Addition = " + (num1 + num2));
        System.out.println("Subtraction = " + (num1 - num2));
        System.out.println("Multiplication = " + (num1 * num2));

        if (num2 != 0) {
            System.out.println("Division = " + (num1 / num2));
            System.out.println("Modulus = " + (num1 % num2));
        } else {
            System.out.println("Division and Modulus cannot be performed because the second number is 0.");
        }

        sc.close();
    }
}

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println("Sum = " + sum);

        sc.close();
    }
}