package wrapper_classes;
class Boxing3{  
    //boxing beats varargs
    static void m(Integer i){System.out.println("Integer");}  
    static void m(Integer... i){System.out.println("Integer...");}  
    
    public static void main(String args[]){  
     int a=30;  
     m(a);  
   }   
  } 