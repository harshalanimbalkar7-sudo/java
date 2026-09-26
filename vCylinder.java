public class vCylinder {
    public static void main(String [] args){
        double r=Double.parseDouble(args[0]);
        double ht=Double.parseDouble(args[1]);
        double vol=Math.PI * r * r * ht;
        System.out.println("Radius: " + r);
        System.out.println("Height: " + ht);
        System.out.println("Volume of cylinder is: " + vol);
    }
}
