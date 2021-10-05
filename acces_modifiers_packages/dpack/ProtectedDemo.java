package acces_modifiers_packages.dpack;
//import cpack.*;
//import bpack.*;
public class ProtectedDemo{
   //access modifiers protection
   //              default  private  protected  public
   // same class   :   Y        Y         Y        Y
   // same package     Y        N         Y        Y
   // non-subclass:
   // same package     Y        N         Y         Y
   // sub class:
   // different package N        N         Y       Y
   // sub class:
   // different package N        N         N        Y
   // non-subclass:
    public static void main(String args[])
    {
      acces_modifiers_packages.apack.A obj=new acces_modifiers_packages.apack.A();
      obj.display();
      
      acces_modifiers_packages.cpack.C objc=new acces_modifiers_packages.cpack.C();
      objc.display();
      
      acces_modifiers_packages.bpack.B objb=new acces_modifiers_packages.bpack.B();
      objb.display();
   }
}