package wrapper_classes;
// Autoboxing/unboxing a Boolean and Character.
// Autoboxing/unboxing takes place with
// method parameters and return values.
class AutoBox2 {
    static Integer m(Integer v) {
    return (v+50) ; // auto-unbox to int
    }
    public static void main(String args[]) {
    Integer iOb = m(100);
    int i=m(250);
    //in parameter boxing takes place where 250 wraps up in Integer wrapper class
    //after returning unboxing takes place where Integer object gts assigned too int i
    System.out.println(iOb);
    System.out.println(i);
    
    }
    }