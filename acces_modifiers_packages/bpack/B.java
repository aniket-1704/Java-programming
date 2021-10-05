package acces_modifiers_packages.bpack;

public class B extends acces_modifiers_packages.apack.A{
    public void display(){
        System.out.println("Derived other package constructor - Class B");
        //System.out.println("n= "+n);          ------n is not public in A; cannot be accessed from outside package
        //System.out.println("n_pri = "+n_pri); ------n_pri has private access in A
        System.out.println("n_pro= "+n_pro);
        System.out.println("n_pub= "+n_pub);
    }
}