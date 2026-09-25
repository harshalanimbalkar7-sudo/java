import java.util.Scanner;
public class capCountry {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr number of countries");
        int n=sc.nextInt();
        sc.nextLine();
        String country[]=new String[n];
        System.out.println("Enetr" + n + " country names:");
        for(int i = 0 ; i < n ; i++){
            country[i]=sc.nextLine();
        }
        System.out.println("Countries in capital letter :");
        for(int i = 0 ; i < n ; i++ ){
            System.out.println(country[i].toUpperCase());
        }
        sc.close();
    }    
}
