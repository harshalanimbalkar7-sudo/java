public class Student {
    int rollno;
    String name;
    double cgpa;
    public Student(){
        rollno=0;
        name="";
        cgpa=0;
    }
    public Student(int rollno, String name, double cgpa){
        this.rollno=rollno;
        this.name=name;
        this.cgpa=cgpa;
    }
    /*public void accpt(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter roll no");
        int rollno=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name:");
        String name=sc.nextLine();
        System.out.println("Enter CGPA");
        double cgpa=sc.nextDouble();
    }*/
    public String toString(){
        return "Roll no:" + rollno + 
        "\nName:"+ name + 
        "\nCGPA:" + cgpa;
    }
    public static void main(String[] args) {
        Student s1=new Student();
       // s1.accpt();
        Student s2=new Student( 101,"charu",8.45);
        System.out.println("Student 1:");
        System.out.println(s1);
        System.out.println("Student 2:");
        System.out.println(s2);

    }
}
