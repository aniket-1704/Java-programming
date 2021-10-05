package thread_programs;

class demo {
    public static void main(String[] args) {
        Com c = new Com();
        Producer p1 = new Producer(c, 1);
        Consumer c1 = new Consumer(c, 1);
        
        p1.start();
        c1.start();
        
    }
}

class Com {
    private int contents;
    private boolean available = false;
//synchronized provides the function of locks in java
    public synchronized int get() {
        while (available == false) {
            try {//wait for available to be true
                wait();//wait method belongs to Object class
            } catch (InterruptedException e) {
            }
        }
        available = false;
        notifyAll();//wakes up threaads who are waiting on this objects monitor
        return contents;
    }

    public synchronized void put(int value) {
        while (available == true) {
            try {//wait for available to be false
                wait();
            } catch (InterruptedException e) {
            }
        }
        contents = value;
        available = true;
        notifyAll();
    }
}

class Consumer extends Thread {
    private Com obj;
    private int number;

    public Consumer(Com c, int number) {
        obj = c;
        this.number = number;
    }

    public void run() {
        int value = 0;
        for (int i = 0; i < 10; i++) {
            value = obj.get();
            System.out.println("Consumer #" + this.number + " got: " + value);
        }
    }
}

class Producer extends Thread {
    private Com obj;
    private int number;

    public Producer(Com c, int number) {
        obj = c;
        this.number = number;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            obj.put(i);
            System.out.println("Producer #" + this.number + " put: " + i);
        }
    }
}