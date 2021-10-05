import java.util.Scanner;

class test_excep extends Exception
{
    public test_excep(String s)
    {
        super(s);
    }  
}
public class temperature
{
    float temp;
    public temperature()
    {
        temp=0f;
    }
    public temperature(float t)
    {
        temp=t;
    }
    void test()throws test_excep
    {
        if(this.temp==0)
        {
            throw new test_excep("Invalid:temp cannot be 0");
        }
        else
        {
            System.out.println("Valid temp");
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the temperature");
        float t=sc.nextFloat();
        temperature obj=new temperature(t);
        try{
            obj.test();
        }
        catch(Exception e)
        {
            System.out.println("error:"+e);
        }
        sc.close();
    }
}
