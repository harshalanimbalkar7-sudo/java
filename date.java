public class date {
    int dd,mm,yy;
    public date(int dd, int mm, int yy){
        this.dd=dd;
        this.mm=mm;
        this.yy=yy;
    }
    public void display(){
        System.out.println("Date is: " + dd + "-" + mm + "-" + yy);
    }
    public static void main(String[] args) {
        date d=new date(20,02,2006);
        d.display();
    }
}
