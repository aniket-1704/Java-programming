
class exa {
    static int a, b;

    public void input(int x, int y) {
        a = x;
        b = y;
    }

    public static void output() {
        System.out.println("a is " + a + " and b is " + b);
    }
}

class example {
    public void input1() {
        System.out.println("aniket");
    }

    public static void output1() {
        System.out.print("aniket gupta");
    }
}

class demo {
    public static void main(String args[]) {
        exa e = new exa();
        e.input(10, 12);
        exa.output();
        example e1 = new example();
        e1.input1();
        example.output1();

    }
}
