package tradingclasses;


class MyThreadRunnable1 implements Runnable {
    public void run(){
        while(true)
            System.out.println("I am Thread 1");
    }
}

class MyThreadRunnable2 implements Runnable {
    public void run(){
        while(true)
            System.out.println("I am Thread 2");
    }
}

public class Thread_Using_Runnable_Interface {
    public static void main(String[] args) {
        MyThreadRunnable1 t1 = new MyThreadRunnable1();
        Thread t11 = new Thread(t1, "This is Name");
        System.out.println(t11.getName());
        MyThreadRunnable2 t2 = new MyThreadRunnable2();
        Thread t22 = new Thread(t2);
        t11.start();
        t22.start();
    }
}
