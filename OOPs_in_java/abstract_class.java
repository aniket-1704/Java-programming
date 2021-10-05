package OOPs_in_java;

// An abstract class must be declared with an abstract keyword.
// It can have abstract and non-abstract methods.
// It cannot be instantiated.
// It can have constructors and static methods also.
// It can have final methods which will force the subclass not to change the body of the method.
abstract class Bike1 {
    abstract void run();
}

class Honda extends Bike1 {
    void run() {
        System.out.println("running safely");
    }

    public static void main(String args[]) {
        Bike1 obj = new Honda();
        obj.run();
    }
}