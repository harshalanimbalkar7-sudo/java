import java.util.Scanner;

class basic {
    int pid;
    String pname;
    double price;

    // Method to accept product details
    void accept() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Product ID: ");
        pid = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Product Name: ");
        pname = sc.nextLine();

        System.out.print("Enter Product Price: ");
        price = sc.nextDouble();
    }

    // Method to display product details
    void display() {
        System.out.println("Product ID   : " + pid);
        System.out.println("Product Name : " + pname);
        System.out.println("Price        : " + price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product p[] = new Product[5];

        // Accept product details
        for (int i = 0; i < 5; i++) {
            p[i] = new Product();
            System.out.println("\nEnter Details of Product " + (i + 1));
            p[i].accept();
        }

        // Search by Product ID
        System.out.print("\nEnter Product ID to Search: ");
        int searchId = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < 5; i++) {
            if (p[i].pid == searchId) {
                System.out.println("\nProduct Found:");
                p[i].display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Product Not Found.");
        }
    }
}

import java.util.Scanner;

class Employee {
    String name;
    double salary;

    // Method to accept employee details
    void accept() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();

        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
        sc.nextLine(); // Clear buffer
    }

    // Method to display employee details
    void display() {
        System.out.println("Name   : " + name);
        System.out.println("Salary : " + salary);
    }

    public static void main(String[] args) {

        Employee emp[] = new Employee[5];

        // Accept details of 5 employees
        for (int i = 0; i < 5; i++) {
            System.out.println("\nEnter Details of Employee " + (i + 1));
            emp[i] = new Employee();
            emp[i].accept();
        }

        // Display details of 5 employees
        System.out.println("\nEmployee Information");
        for (int i = 0; i < 5; i++) {
            System.out.println("\nEmployee " + (i + 1));
            emp[i].display();
        }
    }
}