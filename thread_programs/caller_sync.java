package thread_programs;

class Callme
{
    synchronized void call(String msg)
    {
        System.out.print("[" + msg);
        
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            System.out.println("Interrupted..!!");
        }
        
        System.out.println("]");
    }
}

class Caller implements Runnable
{
    String msg;
    Callme target;
    Thread thr;
    
    public Caller(Callme trg, String str)
    {
        target = trg;
        msg = str;
        thr = new Thread(this);
        thr.start();
    }
    
    public void run()
    {
        // synchronized call block
        target.call(msg);
    }
}

class Synch
{
    public static void main(String args[])
    {
        
        Callme target = new Callme();
        Caller obj1 = new Caller(target, "Hello");
        Caller obj2 = new Caller(target, "Synchronized");
        Caller obj3 = new Caller(target, "World");
        
        /* wait for threads to end */
        try
        {
            obj1.thr.join();
            obj2.thr.join();
            obj3.thr.join();
        }
        catch(InterruptedException e)
        {
            System.out.print("Interrupted..!!");
        }
         
    }
}