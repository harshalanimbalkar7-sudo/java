import StringOperation.comp;
import StringOperation.conc;
import java.util.Scanner;

public class testString {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first String:");
        String s1=sc.nextLine();
        System.out.println("Enter second String:");
        String s2=sc.nextLine();

        conc c=new conc();
        comp cp=new comp();

        System.out.println("Concatenated String is:" + c.concatentate(s1, s2));
        if(cp.compare(s1, s2))
            System.out.println("Both strings are equal.");
        else
            System.out.println("Both strings are not equal.");
        sc.close();
    }
}
