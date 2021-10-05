package thread_programs;
// Create a child thread to display the message 10 times “Child Thread” and main thread to display message 10 times “Parent Thread” using runnable interface
class mythread2 implements Runnable
{
    String msg;
    mythread2(String s)
    {
        msg=s;
    }
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println(msg);
        }
    }
}
class mythread2_exec
{
    public static void main(String[] args)throws InterruptedException
     {
        mythread1 a=new mythread1("Child thread");
        Thread t1=new Thread(a);
        t1.start();
        t1.join();
        Thread t=Thread.currentThread();
        t.setName("Parent Thread");
        for(int i=0;i<10;i++)
        {
            System.out.println(t.getName());
        }
    }
}