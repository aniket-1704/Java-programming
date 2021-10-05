package acces_modifiers_packages.apack;

public class A {
    int n;
    private int n_pri;
    protected int n_pro;
    public int n_pub;
     
    public A(){
      n=1;
      n_pri=2;
      n_pro=3;
      n_pub=4;
    }
    public void display(){
        System.out.println("Using apack - class A");
        System.out.println("n= "+n);
        System.out.println("n_pri = "+n_pri);
        System.out.println("n_pro= "+n_pro);
        System.out.println("n_pub= "+n_pub+"\n");
    }
}