package Collections;
import java.util.*;  
public class array_dequeue {  
//     The ArrayDeque class provides the facility of using deque and resizable-array. It inherits AbstractCollection class and implements the Deque interface.

// The important points about ArrayDeque class are:

// Unlike Queue, we can add or remove elements from both sides.
// Null elements are not allowed in the ArrayDeque.
// ArrayDeque is not thread safe, in the absence of external synchronization.
// ArrayDeque has no capacity restrictions.
// ArrayDeque is faster than LinkedList and Stack.

public static void main(String[] args) {  
    Deque<String> deque=new ArrayDeque<String>();  
    deque.offer("arvind");  
    deque.offer("vimal");  
    deque.add("mukul");  
    deque.offerFirst("jai");  
    deque.addFirst("aniket");
    deque.addLast("gaurav");
    System.out.println("After adding Traversal...");  
    for(String s:deque){  
        System.out.println(s);  
    }  
    //deque.poll();  
    //deque.pollFirst();//it is same as poll()  
    deque.clear();  
    System.out.println("After clear() Traversal...");  
    for(String s:deque){  
        System.out.println(s);  
    }  
}  
}  