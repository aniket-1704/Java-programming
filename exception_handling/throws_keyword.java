package exception_handling;
public class throws_keyword{  
    void method1() throws ArithmeticException{  
     throw new ArithmeticException("Calculation error"); 
    }  
    void method2() throws ArithmeticException{  
     method1();  
    }  
    void method3(){  
     try{  
        method2();  
     }
     catch(ArithmeticException e){
        System.out.println(e.getMessage());
     }  
    }  
    public static void main(String args[]){  
     throws_keyword obj=new throws_keyword ();  
     obj.method3();  
     System.out.println("End Of Program");  
    }  
 }