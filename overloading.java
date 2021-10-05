public class overloading 
{
    //overloading can occur for vriables of lower to higgher order
    //like char to int or int to double not vice versa
    private  void display(String s)
    {
        System.out.println("got string");
    }
    private  void display(overloading o)
    {
        System.out.println("got default object/object");
    }
    private  void display(int n)
    {
        System.out.println("got integer");
    }
    private  void display(float f)
    {
        System.out.println("got float");
    }
    public static void main(String args[])
    {
        overloading o=new overloading();
        o.display(new overloading());
        o.display("hello");
        o.display(1.4f);
        o.display(2);
    }
    
}
