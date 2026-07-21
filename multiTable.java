public class multiTable {
    public static void main(String[] args){
    int num=Integer.parseInt(args[0]);
    System.out.println("Multiplication table of " + num);
    for(int i=1;i<=10;i++)
    {
        System.out.println(num + " * " + i + " = " + (num*i));
    }
}
}


import java.util.Scanner;
import java.util.Arrays;

public class CountrySort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of countries: ");
        int n = sc.nextInt();
        sc.nextLine();

        String country[] = new String[n];

        System.out.println("Enter country names:");
        for (int i = 0; i < n; i++) {
            country[i] = sc.nextLine();
        }

        Arrays.sort(country);

        System.out.println("Countries in Descending Order:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(country[i]);
        }

        sc.close();
    }
}