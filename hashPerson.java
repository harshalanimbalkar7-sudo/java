import java.util.*;
public class hashPerson {
    String name;
    long pmobno;
    public hashPerson(String name,long pmobno){
        this.name=name;
        this.pmobno=pmobno;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr person name:");
        String n1=sc.nextLine();
        System.out.println("Enetr person mobile no:");
        long m1=sc.nextInt();
        sc.nextLine();

        System.out.println("Enetr person name 2:");
        String n2=sc.nextLine();
        System.out.println("Enetr person mobile no 2:");
        long m2=sc.nextInt();
        sc.nextLine();

        hashPerson p1=new hashPerson(n1, m1);
        hashPerson p2=new hashPerson(n2, m2);

        int h1=p1.hashCode();
        int h2=p2.hashCode();

        System.out.println("Enetr person 1 hash code:" + h1);
        System.out.println("Enetr person 2 hash code:" + h2);
        if(h1==h2){
            System.out.println("hash code are equal");
        }else{
            System.out.println("hash code are not equal");
        }
        }
}
