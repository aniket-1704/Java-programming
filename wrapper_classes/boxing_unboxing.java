package wrapper_classes;

class BoxingExample1 {
    //boxing:primitiv data type to its equivalent wrapper class
    //unboxing:vice-versa
    public static void main(String args[]){  
          int a=50;  
          
        //   Integer a2=new Integer(a);//Boxing  
          Integer a2=a;
          Integer a3=5;//AutoBoxing  

          int a4=a2.intValue();//UnBoxing

          int a5=a2;
            
          System.out.println(a2+" "+a3);  
          System.out.println(a4+" "+a5); 
   }
}
