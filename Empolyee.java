public class Empolyee {
    String name;
    double salary;
    public Empolyee(String name, double salary){
        this.name=name;
        this.salary=salary;
    }
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
