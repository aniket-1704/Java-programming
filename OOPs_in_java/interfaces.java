package OOPs_in_java;

// An interface in Java is a blueprint of a class. It has static constants and abstract methods.

// The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods 
// the Java interface, not method body.
//  It is used to achieve abstraction and multiple inheritance in Java.
//it helps in 100% abstraction
//it also supports multiple inheritance
interface Printable {
    void print();
}

interface Showable {
    void print();
}

class TestInterface implements Printable, Showable {
    public void print() {
        System.out.println("Hello");
    }

    public static void main(String args[]) {
        TestInterface obj = new TestInterface();
        obj.print();
    }
}