package Collections;

import java.util.*;  
class book {  
int id;  
String name,author,publisher;  
int quantity;  
public book(int id, String name, String author, String publisher, int quantity) {  
    this.id = id;  
    this.name = name;  
    this.author = author;  
    this.publisher = publisher;  
    this.quantity = quantity;  
}  
}  
public class book_hashset {  
public static void main(String[] args) {  
    //Creating list of Books  
    HashSet<book> list=new HashSet<book>();  
    //Creating Books  
    book b1=new book(101,"Let us C++","Yashwant Kanetkar","BPB",8);  
    book b2=new book(102,"computer Organization","Forouzan","Mc Graw Hill",4);  
    book b3=new book(103,"Operating System","Mark","Wiley",6); 
    book b4=new book(103,"Operating System","Mark","Wiley",6);  
    //Adding Books to list  
    list.add(b1);  
    list.add(b2);  
    list.add(b3); 
    list.add(b4); 
    //Traversing list  
    //for each loop
    for(book b:list){  
        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
    }  
}  
}  