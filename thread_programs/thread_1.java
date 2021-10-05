// Create a child thread to display the message 10 times “Child Thread” and main thread to display message 10 times “Parent Thread” using thread class
package thread_programs;
class mythread1 extends Thread
{
    String msg;
    mythread1(String s)
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
class mythread1_exec
{
    public static void main(String[] args)throws InterruptedException
     {
        mythread1 t1=new mythread1("Child thread");
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