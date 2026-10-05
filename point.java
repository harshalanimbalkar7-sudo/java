public class point {
    int x,y;
    public point(){
        x=0;
        y=0;
    }
    public point(int x, int y){
        this.x=x;
        this.y=y;
    }
    public void display(){
        System.out.println("X:" + x);
        System.out.println("Y:" + y);
    }
}
