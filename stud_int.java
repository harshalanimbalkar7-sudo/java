class rollnoException extends Exception{
    public rollnoException(String message){
        super(message);
    }
}
    public class stud_int{
        int rollno;
        String name;
        int age;
        String course;
        public stud_int(int rollno , String name, int age, String course) throws rollnoException{
            if(rollno < 13001 || rollno > 13080){
                throw new rollnoException("rollno not in range");
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
                stud_int s= new stud_int(13000, " Harshala" , 21 , "BCA");
                s.display();
            } catch (rollnoException e) {
                System.out.println(e.getMessage());
            }
        }
    }
