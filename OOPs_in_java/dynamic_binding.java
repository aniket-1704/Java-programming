package OOPs_in_java;
//static binding is when type of object is known during compile time
//dynamic binding is when type of object is decided at runtime
//method overloading is part of static binding
// In general we can say that overloaded methods are bonded using
//  static binding while overridden methods are bonded using dynamic binding.
class Animal1{  
    void eat(){System.out.println("animal is eating...");}  
   }  
     
   class Dog1 extends Animal1{  
    void eat(){System.out.println("dog is eating...");}  
     
    public static void main(String args[]){  
     Animal1 a=new Dog1();  
     a.eat();  
    }  
   }  
//base class object is reffered to child class 