package bank;

class Mytread1 extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("Tread 1 is running");
        }
    }
}

class Mytread2 extends Thread{

    @Override
    public void run(){
        while(true){
            System.out.println("Tread 2 is running");
        }
    }
}


public class Test {
    public static void main(String[] args) {
        Mytread1 t1 = new Mytread1();
        Mytread2 t2 = new Mytread2();
        t1.run();
        t2.run();
    }

}
