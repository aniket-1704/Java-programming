 class A

//inheritance in java
// ->single
// ->multilevel
// ->hybrid
{
    private int a;
    private int b;
    // protected float c;
    // protected float d;
    // public int e;
    // public int f;
    public A()
    {}
    A(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    void display()
    {
        System.out.println("a =" + a);
        System.out.println("b =" + b);
    }
}
 class B extends A
{
    protected float c;
    protected float d;
    public B()
    {}
    B(int a,int b,float c,float d)
    {
        super(a,b);//super to invoke base class method or constructor
        this.c=c;
        this.d=d;
    }
    void display()
    {
        super.display();
        System.out.println("c = "+c);
        System.out.println("d = "+d);
    }
}
 class C extends B{
    public int e;
    public int f;
    public C()
    {}
    C(int a,int b,float c,float d,int e,int f)
    {
        super(a,b,c,d);
        this.e=e;
        this.f=f;
    }
    void display()
    {
        super.display();
        System.out.println("e = "+e);
        System.out.println("f = "+f);
    }
}
 class D extends B{
    public int g;
    public D()
    {}
    D(int a,int b,float c,float d,int g)
    {
        super(a,b,c,d);
        this.g=g;
    }
    void display()
    {
        super.display();
        System.out.println("g = "+g);
    }
}
public class inheritance
{
    public static void main(String args[])
    {
        //object of class B
        B  obj_b=new B(2,3,4.3f,6.3f);
        //object of class D
        D obj_d=new D(2,5,7.8f,9f,11);
        System.out.println("member variables of class B:");
        obj_b.display();
        System.out.println("member variables of class D:");
        obj_d.display();

    }
}