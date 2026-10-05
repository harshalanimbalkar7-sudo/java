import java.util.Scanner;
public class product {
    int id;
    String name;
    double price;
    public void accpet(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr product id:");
        id=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter product name:");
        name=sc.nextLine();
        System.out.println("Enter price:");
        price=sc.nextDouble();
    }
    public void display(){
        System.out.println("Prdouct id: " + id);
        System.out.println("Prdouct name: " + name);
        System.out.println("Prdouct price: " + price);
    }
    public static void main(String[] args){
        product p[]=new product[5];
        for(int i=0;i<5;i++){
            p[i]=new product();
            System.out.println("Enetr product deatils: " + (i+1));
            p[i].accpet();
        }
        int min=0;
        for(int i=1;i < 5 ; i++){
            if(p[i].price < p[min].price){
                min=i;
            }
        }
        System.out.println("Minimum price is:");
        p[min].display();
    }
}
