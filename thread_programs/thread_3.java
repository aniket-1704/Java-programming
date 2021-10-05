package thread_programs;

class mythreads1 extends Thread
{
    String msg;
    mythreads1(String s)
    {
        msg=s;
        Thread.currentThread().setName(s);
        System.out.println(Thread.currentThread().getName());
    }
    public void run()
    {
        System.out.println("Multiples of 10");
        for(int i=0;i<100;i++)
        {
            if(i%10==0)
            {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}
class mythreads2 extends Thread
{
    String msg;
    mythreads2(String s)
    {
        msg=s;
        System.out.println(msg);
    }
    public void run()
    {
        System.out.println("Multiples of 2");
        for(int i=0;i<100;i++)
        {
            if(i%2==0)
            {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}
class mythreads3 extends Thread
{
    String msg;
    mythreads3(String s)
    {
        msg=s;
        System.out.println(msg);
    }
    public void run()
    {
        System.out.println("Multiples of 5");
        for(int i=0;i<100;i++)
        {
            if(i%5==0)
            {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}
class mythreads_exec
{
    public static void main(String[] args)throws InterruptedException
     {
        mythreads1 t1=new mythreads1("Child thread 1");
        
        t1.start();
        System.out.println("Child Thread 1 is alive: "+t1.isAlive());
        t1.join();
        mythreads2 t2=new mythreads2("Child thread 2");
        
        t2.start();
        System.out.println("Child Thread 2 is alive: "+t2.isAlive());
        t2.join();
        mythreads3 t3=new mythreads3("Child thread 3");
        
        t3.start();
        System.out.println("Child Thread 3 is alive: "+t3.isAlive());
        t3.join();

        System.out.println("Child Thread 1 is alive: "+t1.isAlive());
        System.out.println("Child Thread 2 is alive: "+t2.isAlive());
        System.out.println("Child Thread 3 is alive: "+t3.isAlive());

        System.out.println("Main Thread exiting ...");

    //     Thread t=Thread.currentThread();
    //     t.setName("Parent Thread");
    //     for(int i=0;i<10;i++)
    //     {
    //         System.out.println(t.getName());
    //     }
      }
}