public class cylinder extends shape {
    double radius,ht;
    public cylinder(double radius, double ht){
        this.radius=radius;
        this.ht=ht;
    }
    public void area(){
        double area= 2 * 3.142 * radius * (radius + ht);
        System.out.println("Area of sylinder is: " + area );
    }
    public void volume(){
        double volume = 3.142 * radius * radius * ht;
        System.out.println("Volume of cylimder is: " + volume);
    }
    public static void main(String[] args) {
        cylinder cy=new cylinder(3,4);
        cy.area();
        cy.volume();
    }
}
