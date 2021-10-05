package exception_handling;
public class finally_program{  
    public static void main(String args[])throws ArithmeticException{  
    try{  
     int data=25/0;  
     System.out.println(data);  
    }  
    catch(ArithmeticException e){System.out.println(e);}  
    finally{System.out.println("finally block is always executed");}  
    System.out.println("rest of the code...");  
    }  
  } 