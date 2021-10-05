package Collections;

import java.util.*;  
class HashSet3{  
//     Java HashSet class is used to create a collection that uses a hash table for storage. It inherits the AbstractSet class and implements Set interface.

// The important points about Java HashSet class are:

// HashSet stores the elements by using a mechanism called hashing.
// HashSet contains unique elements only.
// HashSet allows null value.
// HashSet class is non synchronized.
// HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
// HashSet is the best approach for search operations.
// The initial default capacity of HashSet is 16, and the load factor is 0.75.
 public static void main(String args[]){  
  HashSet<String> set=new HashSet<String>();  
           set.add("Ravi");  
           set.add("Vijay");  
           set.add("Arun");  
           set.add("Sumit");  
           System.out.println("An initial list of elements: "+set);  
           //Removing specific element from HashSet  
           set.remove("Ravi");  
           System.out.println("After invoking remove(object) method: "+set);  
           HashSet<String> set1=new HashSet<String>();  
           set1.add("Ajay");  
           set1.add("Gaurav");
           set1.add("anu");  
           set.addAll(set1);  
           System.out.println("Updated List: "+set);  
           //Removing all the new elements from HashSet  
           set.removeAll(set1);  
           System.out.println("After invoking removeAll() method: "+set);  
           //Removing elements on the basis of specified condition  
           set.removeIf(str->str.contains("Vijay"));    
           System.out.println("After invoking removeIf() method: "+set);  
           //Removing all the elements available in the set  
           set.clear();  
           System.out.println("After invoking clear() method: "+set);  
 }  
} 