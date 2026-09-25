import java.util.Scanner;
import utility.capitalString;
public class person {
    private String name;
    private String city;
    public void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a name:");
        name=sc.nextLine();
        System.out.println("Enter a city:");
        city=sc.nextLine();
    }
    public void display(){
        capitalString cs= new capitalString();
        System.out.println("Name: " + cs.convert(name));
        System.out.println("City: " + cs.convert(city));
    }
    public static void main(String[] args)
    {
        person p = new person();
        p.accept();
        p.display();
    }
}
