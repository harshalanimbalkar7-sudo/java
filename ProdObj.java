import java.util.Scanner;
public class ProdObj {
    int pid;
    String pname;
    double price;
    public ProdObj(int pid,String pname,double price ){
        this.pid=pid;
        this.pname=pname;
        this.price=price;
    }
    public void display(){
        System.out.println("Product Id:" + pid );
        System.out.println("Product Name:" + pname );
        System.out.println("Product price:" + price );
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr no of products");
        int n=sc.nextInt();
        sc.nextLine();
        ProdObj products[]=new ProdObj[n];
        for(int i=0;i < n ; i++){
            System.out.println("Enter product deatils:" + (i+1));
            System.out.println("Enter product id:");
            int id=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter product name:");
            String name=sc.nextLine();
            System.out.println("Enter product price:");
            double price=sc.nextDouble();
            products[i]=new ProdObj(id,name,price);
        }
        System.out.println("Enter product to search");
        int srch_id=sc.nextInt();
        boolean found =false;
        for(int i=0;i<n;i++){
            if(products[i].pid==srch_id){
                System.out.println("product found");
                products[i].display();
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("product not found");
        }
        sc.close();
        }
}
