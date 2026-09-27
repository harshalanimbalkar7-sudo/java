import java.io.*;
import java.util.*;
public class upperCase {
    public static void main(String args[]) throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr source file:");
        String source=sc.nextLine();
        System.out.println("Enetr Destination file:");
        String dest=sc.nextLine();

        FileReader fr=new FileReader(source);
        FileWriter fw=new FileWriter(dest);
        int ch;
        while((ch=fr.read())!=-1){
            fw.write(Character.toUpperCase((char)ch));
        }
        fr.close();
        fw.close();
        System.out.println("File content copied succefully!");
    }
}
