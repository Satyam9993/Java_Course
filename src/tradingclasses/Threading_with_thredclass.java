package tradingclasses;


class MyTread1 extends Thread{
    @Override
    public void run(){
        while(true)
        {
            System.out.println("This is Thread 1");
            System.out.println("I am happy");
        }
    }
}
class MyTread2 extends Thread{
    @Override
    public void run(){
        while(true)
        {
            System.out.println("This is Thread 2");
            System.out.println("I am sad");
        }
    }
}

public class Threading_with_thredclass {
    public static void main(String[] args) {
        MyTread1 t1 = new MyTread1();
        MyTread2 t2 = new MyTread2();
        t1.start();
        t2.start();
    }
}
