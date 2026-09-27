import java.io.*;
import java.util.*;
public class FileDetails {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr file name:");
        String filename=sc.nextLine();
        File f=new File("filename");
        if(f.exists()){
            System.out.println("File Exists!");
            System.out.println("file size: " + f.length() + "bytes");
            System.out.println("LAst modified time:" + new Date(f.lastModified()));
        }else{
            System.out.println("File dose'nt exits");
        }
    }
}
