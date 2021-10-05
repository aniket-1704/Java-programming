package Collections;

import java.util.*;  
class Books implements Comparable<Books>{  
int id;  
String name,author,publisher;  
int quantity;  
public Books(int id, String name, String author, String publisher, int quantity) {  
    this.id = id;  
    this.name = name;  
    this.author = author;  
    this.publisher = publisher;  
    this.quantity = quantity;  
}  
public int compareTo(Books b) {  
    if(id>b.id){  
        return -1;  
    }else if(id<b.id){  
        return 1;  
    }else{  
    return 0;  
    }  
}  
}  
 class TreeSetExample {  
public static void main(String[] args) {  
    Set<Books> set=new TreeSet<Books>();  
    //Creating Books  
    Books b1=new Books(121,"Let us C","Yashwant Kanetkar","BPB",8);  
    Books b2=new Books(233,"Operating System","Galvin","Wiley",6);  
    Books b3=new Books(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
    //Adding Books to TreeSet  
    set.add(b1);  
    set.add(b2);  
    set.add(b3);  
    //Traversing TreeSet  
    for(Books b:set){  
    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
    }  
}  
}