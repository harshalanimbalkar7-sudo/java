import java.io.*;

public class BStudent {
    int rollno;
    String name;
    String sclass;
    double per;

    public void accept() throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Roll no :");
        rollno =Integer.parseInt(br.readLine());
        System.out.println("Enter name: ");
        name=br.readLine();
        System.out.println("Enter percentage:");
        per=Double.parseDouble(br.readLine());
        }
        public void display(){
            System.out.println("Roll no: " + rollno);
            System.out.println("Name: " + name);
            System.out.println("class: " + sclass);
            System.out.println("Percentage: " + per);
        }
        public static void main(String[] args) throws IOException {
            System.out.println("Student Details are:");
            BStudent s=new BStudent();
            
            s.accept();
            s.display();
        }

}
