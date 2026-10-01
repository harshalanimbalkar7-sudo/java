import java.util.Scanner;
public class slipQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int sum=0;
        System.out.println("Enetr " + n + "numbers:");
        for(int i=0 ; i < n; i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        System.out.println("Sum of numbers is " + sum);
        sc.close();
     }
}
