package file_handling_programs;
//program to read data from a file using input stream
import java.io.*;  
class DataStreamExample {  
  //read from file using fileinputstream
     public static void main(String args[]){    
          try{    
            FileInputStream fin=new FileInputStream("output.txt");   
            //reds in form of integer 
            int i=fin.read();  
            System.out.print((char)i);    
  
            fin.close();    
          }catch(Exception e){System.out.println(e);}  
          // try{    
          //   FileInputStream fin=new FileInputStream("f8.java");    
          //   int i=0;    
          //   while((i=fin.read())!=-1){    
          //    System.out.print((char)i);    
          //   }    
          //   fin.close();    
          // }catch(Exception e)
          // {
          // System.out.println(e);
          // }   
         }    
        } 