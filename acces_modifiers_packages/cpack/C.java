package acces_modifiers_packages.cpack;

public class C
{
   public void display()
   {
        acces_modifiers_packages.apack.A o=new acces_modifiers_packages.apack.A();
        System.out.println("c class");
        //System.out.println("n= "+o.n);               n is not public in A; cannot be accessed from outside package
        //System.out.println("n_pri = "+o.n_pri);      n_pri has private access in A
        //System.out.println("n_pro= "+o.n_pro);       n_pro has protected access in A
        System.out.println("n_pub= "+o.n_pub+"\n");
   }
}