package file_handling_programs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class library {
    public static void main(String args[]) {
        if (args.length != 1) {
            System.out.println("file not found");
        } else {
            try {
                FileOutputStream fout = new FileOutputStream(args[0]);
                FileInputStream fin = new FileInputStream(args[0]);
                Scanner sc = new Scanner(System.in);
                System.out.println("enter name of book");
                String book = sc.nextLine();
                System.out.println("enter the name of the author");
                String author = sc.nextLine();
                while (!book.equals("stop") && !author.equals("stop")) {
                    String content = book + " : " + author;
                    byte[] b = content.getBytes();
                    fout.write(b);
                    System.out.println("enter name of book");
                    book = sc.nextLine();
                    System.out.println("enter the name of the author");
                    author = sc.nextLine();
                }
                while(fin.read()!=-1)
                {
                    char c=(char)fin.read();
                    System.out.print(c);
                }
                sc.close();
                fout.close();
                fin.close();
            } catch (Exception e) {
                System.out.println("error occured");
            }
        }
    }
}
