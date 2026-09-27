public class Programmer extends Empolyee{
    String proglang;
    public Programmer(String name , double salary , String proglang ){
        super(name , salary);
        this.proglang=proglang;
    }
    public void display(){
        super.display();
        System.out.println("PRogramming langauge: " + proglang);
    }
    public static void main(String[] args) {
            Programmer p = new Programmer("Harshala" , 4003000, "Java");
            p.display();
    }
    
}
