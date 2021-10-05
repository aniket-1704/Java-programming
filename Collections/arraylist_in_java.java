package Collections;
// // Java ArrayList class uses a dynamic array for storing the elements. It is like an array, but 
// there is no size limit. We can add or remove elements anytime. So, it is much more 
// flexible than the traditional array. It is found in the java.util package. It is like the Vector in C++.

// // The ArrayList in Java can have the duplicate elements also. It
//  implements the List interface so we can use all the methods of List 
//  interface here. The ArrayList maintains the insertion order internally.

// // It inherits the AbstractList class and implements List interface.
import java.util.*;  
class Arraylist_java{  
 public static void main(String args[]){  
    ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
           list.add("Ravi");//Adding object in arraylist  
           list.add("Vijay");  
           list.add("Ravi");  
           list.add("Ajay");  
            
           System.out.println("Traversing list through List Iterator:");  
           //Here, element iterates in reverse order  
              ListIterator<String> list1=list.listIterator(list.size());  
              while(list1.hasPrevious())  
              {  
                  String str=list1.previous();  
                  System.out.println(str);  
              }  
        System.out.println("Traversing list through for loop:");  
           for(int i=0;i<list.size();i++)  
           {  
            System.out.println(list.get(i));     
           }  
              
        System.out.println("Traversing list through forEach() method:");  
        //The forEach() method is a new feature, introduced in Java 8.  
            list.forEach(a->{ //Here, we are using lambda expression  
                System.out.println(a);  
              });  
                
            System.out.println("Traversing list through forEachRemaining() method:");  
              Iterator<String> itr=list.iterator();  
              itr.forEachRemaining(a-> //Here, we are using lambda expression  
              {  
            System.out.println(a);  
              });  
 }  
}  