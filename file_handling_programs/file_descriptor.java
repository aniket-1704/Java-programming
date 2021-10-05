package file_handling_programs;

//To rertrive the file descriptor
import java.io.*;  
class JavaFileInputStreamgetFDExample1  {  
public static void main(String[] args) {  
       FileOutputStream fout ;  
       FileInputStream fin ;  
         
    try {  
        File file = new File("out3.txt");  
        file.createNewFile();  
        fout = new FileOutputStream(file);  
        String str="hello world iv semester";  
       char arr[] =str.toCharArray();  
        for(int i=0; i<str.length();i++)       
        {  
            fout.write(arr[i]);  
        }  
        fin = new FileInputStream(file);  
        System.out.println("Available byte "+ fin.available());  
        System.out.print("file descriptor--> ");  
         // get file descriptor instance  
         System.out.println(fin.getFD());  
         System.out.print("String that are stored in the file----->   ");  
        int readfile;  
          do {  
                
             readfile =fin.read();  
              if(readfile != -1)  
              {  
               System.out.print((char)readfile);  
              }}  
          while(readfile != -1);  
          }  
    catch(Exception e)  
    {  
        System.out.println(e);  
  }}}