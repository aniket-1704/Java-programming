package generics;

/* A simple generic class.  Here, T is a type parameter that  will be replaced by a real type  when an object of type Gen is created.*/
class Gen<T> {
    T ob; // declare an object of type T
    // Pass to the constructor a reference to an object of type T.

    Gen(T o) {
        ob = o;
    }

    // Return ob.
    T getob() {
        return ob;
    }

    // Show type of T.
    void showType() {
        System.out.println("Type of T is " + ob.getClass().getName());
    }
}

// Demonstrate the generic class.
class GenDemo {
    public static void main(String args[]) {
        // Create a Gen reference for Integers.
        Gen<Integer> iOb;
        /*
         * Create a Gen<Integer> object and assign its reference to iOb. Notice the use
         * of autoboxing to encapsulate the value 88 within an Integer object.
         */
        iOb = new Gen<Integer>(88); // Show the type of data used by iOb.
        iOb.showType(); // Get the value in iOb. Notice that no cast is needed.
        int v = iOb.getob();
        System.out.println("value: " + v);
        Gen<Float> obj1;
        obj1 = new Gen<Float>(88.5F); // Show the type of data used by iOb.
        obj1.showType(); // Get the value in iOb. Notice that no cast is needed.
        float v1 = obj1.getob();
        System.out.println("value: " + v1);
        Gen<String> str1 = new Gen<String>("hello world");
        System.out.println("value: " + str1.getob());
        str1.showType();
        // iOb=obj1;
        // iOb=str1;
        // str1=iOb;
        Gen<Integer> iOb1 = new Gen<Integer>(100);
        iOb1 = iOb;
        iOb1.getob();
    }
}