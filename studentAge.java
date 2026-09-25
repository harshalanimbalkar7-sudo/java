class AgeNotWithinRangeException extends Exception{
    public AgeNotWithinRangeException(String message){
        super(message);
    }
}
public class studentAge {
    int rollno;
    String name;
    int age;
    String course;
    public studentAge(int rollno , String name, int age, String course) throws AgeNotWithinRangeException{
        if( age < 15 || age > 21){
            throw new AgeNotWithinRangeException("Age is not whithin range");
        }
        this.rollno=rollno;
        this.name=name;
        this.age=age;
        this.course=course;
    }
    public void display(){
        System.out.println("Roll no: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
    public static void main(String[] args) {
        try {
            studentAge s=new studentAge(101,"charu", 21,"BCA");
            s.display();
        } catch (AgeNotWithinRangeException e) {
            System.out.println(e.getMessage());
        }
    }
}
