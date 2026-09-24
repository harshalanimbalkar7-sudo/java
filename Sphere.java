public class Sphere {
    double radius;
    double volume;
    double surfaceArea;
    public void calculate(){
       surfaceArea=4*3.14*(radius*radius);
        volume=(4/3)*3.14*(radius*radius*radius);
    }
    public void display(){
        System.out.println("Radius is:" + radius);
        System.out.println("volume is:" + volume);
        System.out.println("Surface Area is:" + surfaceArea);
    }
    public static void main(String[] args) {
        Sphere s=new Sphere();
        s.radius=Double.parseDouble(args[0]);
        s.calculate();
        s.display();
    }
}
