public class sumOfDigit{
    public static void main(String[] args) {
        System.out.println("Enetr a number:");
        int num=Integer.parseInt(args[0]);
        int sum=0;
        while(num!=0){
            int digit=num % 10;
            sum= sum + digit;
            num = num / 10;
        }
        System.out.println("Sum of number is: " + sum);
    }
}
