import java.io.*;


public class reverseNum{
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number:");
        int num=Integer.parseInt(br.readLine());
        
        int rev=0;
        while(num!=0){
            int digit=num % 10;
            rev= rev * 10 + digit;
            num = num / 10;
        }
        System.out.println("REverse number is : " + rev);
    }
}