package file_handling_programs;

import java.io.*;

class FileReader_Writer_Example {
      // write in file using filewriter
      public static void main(String args[]){    
           try{
             File f=new File("output.txt") ;   
             FileWriter fw=new FileWriter(f);    
             String s="Good Morning students of IV A semester ";    
            //  byte b[]=s.getBytes();//converting string into byte array    
             fw.write(s);    
             fw.close();    
             System.out.println("success...");    
            }catch(Exception e){
            System.out.println(e);
            } 
            //read a file using filereader  
            try{
                File f=new File("output.txt") ;   
                FileReader fr=new FileReader(f);       
               //  byte b[]=s.getBytes();//converting string into byte array   
                int n;
                do{
                    n=fr.read();
                    if(n!=-1)
                    System.out.print((char)n);
                }while(n!=-1) ;
                fr.close();      
               }catch(Exception e){
               System.out.println(e);
               }  
      }
}
//filewriter fw.write()->writes strings
//fileoutpurstream fout.write()->writes bytes