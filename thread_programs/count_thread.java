package thread_programs;

public class count_thread extends Thread 
{
  public static int amount = 0;
  public static void main(String[] args)
   {
   count_thread thread = new count_thread();
    thread.start();
    System.out.println(amount);
    amount++;
    System.out.println(amount);
  }
  public void run()
   {
    amount++;
  }
}