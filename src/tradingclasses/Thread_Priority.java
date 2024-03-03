package tradingclasses;


class T1 extends Thread{

    T1(){
        super("T2");
    }
    public void run(){
        System.out.println("This is Thread 1");
    }
}

class T2 extends Thread{
    T2(){
        super("T1");
    }

    public void run(){
        System.out.println("This is Thread 2");
    }
}
class T3 extends Thread{
    T3(){
        super("T3");
    }

    public void run(){
        System.out.println("This is Thread 3");
    }
}

class T4 extends Thread{
    T4(){
        super("T4");
    }

    public void run(){
        System.out.println("This is Thread 4");
    }
}

class T5 extends Thread{
    T5(){
        super("T5");
    }

    public void run(){
        System.out.println("This is Thread 5");
    }
}

public class Thread_Priority {
    public static void main(String[] args) {
            T1 t1 = new T1();
            T2 t2 = new T2();
            T3 t3 = new T3();
            T4 t4 = new T4();
            T5 t5 = new T5();
            t1.setPriority(1);
            t2.setPriority(10);
            t1.start();
            t2.start();
            t3.start();
            t4.start();
            t5.start();
    }
}
