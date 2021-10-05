package OOPs_in_java;
//static variables are initialized only once 
//memory is allocated only allocated once
//static block is executed even before main method
class static_counter {
    static int count = 0;// will get memory only once and retain its value

    static_counter() {
        count++;// incrementing the value of static variable

    }

    void display() {
        System.out.println(count);
    }

    public static void main(String args[]) {
        // creating objects
        static_counter c1 = new static_counter();
        c1.display();
        static_counter c2 = new static_counter();
        c2.display();
        static_counter c3 = new static_counter();
        c3.display();
    }
}