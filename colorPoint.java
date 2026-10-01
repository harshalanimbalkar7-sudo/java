public class colorPoint extends point {
    String color;
    public colorPoint(int x,int y, String color){
        super(x,y);
        this.color=color;
    }
    public void display(){
        super.display();
        System.out.println("Color: " + color);
    }
    public static void main(String[] args) {
        colorPoint cp=new colorPoint(4,5,"red");
        cp.display();
    }
}
