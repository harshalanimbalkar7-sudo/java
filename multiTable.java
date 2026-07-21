public class multiTable {
    public static void main(String[] args){
    int num=Integer.parseInt(args[0]);
    System.out.println("Multiplication table of " + num);
    for(int i=1;i<=10;i++)
    {
        System.out.println(num + " * " + i + " = " + (num*i));
    }
}
}
