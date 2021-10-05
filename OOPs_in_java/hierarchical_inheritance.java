package OOPs_in_java;

class Animal__ {
    void eat() {
        System.out.println("eating...");
    }
}

class Dog__ extends Animal__ {
    void bark() {
        System.out.println("barking...");
    }
}

class Cat extends Animal__ {
    void meow() {
        System.out.println("meowing...");
    }
}

class TestInheritance3 {
    public static void main(String args[]) {
        Cat c = new Cat();
        c.meow();
        c.eat();
        // c.bark();//C.T.Error
    }
}