import java.util.Scanner;
public class Student {
    int rollno;
    String name;
    double CGPA;
    public Student(){
        rollno=0;
        name="";
        CGPA=0.0;
    }
    public Student(int rollno, String name,double CGPA){
        this.rollno=rollno;
        this.name=name;
        this.CGPA=CGPA;
    }
    public void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter roll no:");
        rollno=sc.nextInt();
        sc.nextLine();
        System.out.println("enter name:");
        name=sc.nextLine();
        System.out.println("Enetr CGPA:");
        CGPA=sc.nextDouble();
    }
    public String toString(){
        return "Roll no:" + rollno +
        "\nName:" + name + 
        "\nGPA:" + CGPA;
    }
    public static void main(String[] args) {
        Student s1=new Student();
        s1.accept();
        Student s2=new Student(101,"hasrhala",8.45);
        System.err.println("student 1");
        System.err.println(s1);
        System.err.println("\nstudent 2");
        System.err.println(s2);
     
    }
}
