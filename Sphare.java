public class Sphare {
    double radius;
    double surfaceArea;
    double volume;
    public void calulate(){
        surfaceArea = 4 * 3.14 * radius * radius;
        volume=(4.0 / 3.0) * 3.14 * radius * radius * radius;
    }
    public void display(){
        System.out.println("Radius: " + radius);
        System.out.println("surface area of sphere: " + surfaceArea);
        System.out.println("volume of sphere: " + volume);
    }
    public static void main(String[] args) {
        Sphare s=new Sphare();
        s.radius=Double.parseDouble(args [0]);
        s.calulate();
        s.display();
    }
}
