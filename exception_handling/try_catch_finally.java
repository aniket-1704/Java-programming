package exception_handling;

// Java program to demonstrate 
// control flow of try-catch-finally clause
// when exception occur in try block
// and handled in catch block
public class try_catch_finally
{
    public static void main (String[] args) 
    {
          
        // array of size 4.
        int[] arr = new int[4];
          
        try
        {
            int i = arr[5];
                       
            System.out.println("Inside try block");
        }
          
        catch(ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("Exception caught in catch block");
        }
          
        finally
        {
            System.out.println("finally block executed");
        }
          
        // rest program will be executed
        System.out.println("Outside try-catch-finally clause");
    }
}