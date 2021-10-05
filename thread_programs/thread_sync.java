package thread_programs;

class ticket_booking implements Runnable
{
    //thread synchronization 
    //objects sharing same resource
    int tickets_avail=1;
    public void run()
    {
        System.out.println("waiting to book ticket for : " + Thread.currentThread().getName());
        synchronized(this)
        {
            if(tickets_avail!=0)
            {
                System.out.println(" booking ticket for : " + Thread.currentThread().getName());
                try{
                    Thread.sleep(1000);
                }catch(Exception e){}
                tickets_avail--;
                System.out.println("ticket booked for : " + Thread.currentThread().getName());
                System.out.println("tickets availabe : "+tickets_avail);
            }
            else{
                System.out.println("tickets not availabe for : " + Thread.currentThread().getName());
            }
        }
    }
}
public class thread_sync
{
    public static void main(String args[])
    {
        ticket_booking obj=new ticket_booking();
        Thread thread1=new Thread(obj,"passenger 1");
        Thread thread2=new Thread(obj,"passenger 2");

        thread1.start();
        thread2.start();
    }
}