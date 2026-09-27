import java.util.Scanner;
public class searchProduct {
    int pid;
    String name;
    double price;
    public searchProduct(int pid,String name,double price){
        this.pid=pid;
        this.name=name;
        this.price=price;
    }
    public void display(){
        System.out.println("Product Id:" + pid);
        System.out.println("Product name:" + name);
        System.out.println("price:" + price);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of products:");
        int n=sc.nextInt();
        sc.nextLine();
        searchProduct products[]=new searchProduct[n];
        for(int i=0 ; i < n ; i++){
            System.out.println("Enetr details of product: " + (i+1));
            System.out.println("Enetr product id:");
            int id=sc.nextInt();
            sc.nextLine();
            System.out.println("Enetr product name:");
            String name=sc.nextLine();
            System.out.println("Enter price:");
            double price= sc.nextDouble();
            products[i]=new searchProduct(id,name,price);
        }
        System.out.println("Enter product to search:");
        int s_id=sc.nextInt();
        boolean found = false;
        for(int i = 0 ; i < n ; i++){
            if(products[i].pid==s_id){
                System.out.println("product found!");
                products[i].display();
                found = true;
            }
        }
        if(!found){
            System.out.println("product not found!");
        }
        sc.close();
    }
}
