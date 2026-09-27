import java.io.*;
public class CountDigit {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number:");
        int num=Integer.parseInt(br.readLine());
        int count=0;
        while(num!=0){
            num = num / 10;
            count++;
        }
        System.out.println("Count of digit is: " + count);
    }
}
