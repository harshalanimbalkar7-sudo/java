public class optCircle implements opt {
    double radius;
    public optCircle(double radius){
        this.radius=radius;
    }
    public void calArea(){
        double area= PI * radius * radius;
        System.out.println("Area of circle is: " + area);
    }
    public void calCircum(){
        double circum= 2 * PI * radius;
        System.out.println("Circumtance of circle is: " + circum);
    }
    public static void main(String[] args) {
        optCircle c= new optCircle(6);
        c.calArea();
        c.calCircum();
    }
}
