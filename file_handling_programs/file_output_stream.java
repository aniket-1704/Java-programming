package file_handling_programs;

//program to write to a file
//import java.io.FileOutputStream; 
import java.io.*;

class FileOutputStreamExample {
      // write in file using fileoutputstream
      public static void main(String args[]){    
           try{
             File f=new File("output.txt") ;   
             FileOutputStream fout=new FileOutputStream(f);    
             String s="Good Morning students of IV A semester ";    
             byte b[]=s.getBytes();//converting string into byte array    
             fout.write(b);    
             fout.close();    
             System.out.println("success...");    
            }catch(Exception e){
            System.out.println(e);
            }    
      }
}